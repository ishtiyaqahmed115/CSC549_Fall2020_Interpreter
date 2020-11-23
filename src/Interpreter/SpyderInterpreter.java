package Interpreter;

import java.util.ArrayList;

import Parser.*;

public class SpyderInterpreter 
{
	private static VariableEnvironment theEnv = new VariableEnvironment();
	private static ArrayList<String> theOutput = new ArrayList<String>();
	
	public static void displayResults()
	{
		System.out.println("Current Variable Environment");
		SpyderInterpreter.theEnv.display();
		for(String s : SpyderInterpreter.theOutput)
		{
			System.out.println(s);
		}
	}
	
	public static void interpret(ArrayList<Statement> theStatements)
	{
		for(Statement s : theStatements)
		{
			if(s instanceof RememberStatement)
			{
				//interpret a remember statement
				SpyderInterpreter.interpretRememberStatement((RememberStatement)s);
			}
			if(s instanceof QuestionStatement)
			{
				//interpret a question statement
				SpyderInterpreter.interpretQuestionStatement((QuestionStatement)s);
			}
		}
	}
	
	//determines if a String contains all digits (numbers)
	private static boolean isInteger(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(!Character.isDigit(s.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	private static int interpretLiteralExpression(LiteralExpression le)
	{
		if(le instanceof Int_LiteralExpression)
		{
			return ((Int_LiteralExpression) le).getValue();
		}
		throw new RuntimeException("Not a valid literal type...");
	}
	
	public static int interpretBooleanExpression(TestExpression te)
	{
		Expression leftExpression = te.getLeftExpression();
		int leftValue = SpyderInterpreter.getExpressionValue(leftExpression);
		Expression rightExpression = te.getRightExpression();
		int rightValue = SpyderInterpreter.getExpressionValue(rightExpression);
		String logical_operator = te.getLogicalOperator();
		
		//0 --> True , 1 --> False
		if(logical_operator.equals("=="))
		{
			if(leftValue == rightValue) {
				return 0;
			}else {
				return 1;
			}
			
		}
		else if(logical_operator.equals("!="))
		{
			if(leftValue != rightValue) {
				return 0;
			}else {
				return 1;
			}
		}
		else if(logical_operator.equals("<"))
		{
			if(leftValue < rightValue) {
				return 0;
			}else {
				return 1;
			}
		}
		else if(logical_operator.equals("<="))
		{
			if(leftValue <= rightValue) {
				return 0;
			}else {
				return 1;
			}
		}
		else if(logical_operator.equals(">"))
		{
			if(leftValue > rightValue) {
				return 0;
			}else {
				return 1;
			}
		}
		else if(logical_operator.equals(">="))
		{
			if(leftValue >= rightValue) {
				return 0;
			}else {
				return 1;
			}
		}
		
		throw new RuntimeException("Not a valid logical operator: " + logical_operator);
		
	}
	public static int interpretDoMathExpression(DoMathExpression dme)
	{
		Expression left = dme.getLeft();
		int leftValue = SpyderInterpreter.getExpressionValue(left);
		Expression right = dme.getRight();
		int rightValue = SpyderInterpreter.getExpressionValue(right);
		String math_op = dme.getOp();
		
		if(math_op.equals("+"))
		{
			return leftValue + rightValue;
		}
		else if(math_op.equals("-"))
		{
			return leftValue - rightValue;
		}
		else if(math_op.equals("*"))
		{
			return leftValue * rightValue;
		}
		else if(math_op.equals("/"))
		{
			return leftValue / rightValue;
		}
		else if(math_op.equals("%"))
		{
			return leftValue % rightValue;
		}
		throw new RuntimeException("Not a valid math operator: " + math_op);
	}
	
	private static int interpretResolveExpression(ResolveExpression rs)
	{
		
		//only look up the variable in the env if it is not a LITERAL
		//Literal Types: int
		//this try/catch attempts to convert a string to an int and if it fails it
		//looks the string up as a variable name
		try
		{
			//tries to treat it as a int literal
			return Integer.parseInt(rs.getName());	
		}
		catch(Exception e)
		{
			try
			{
				//if not a literal, look it up in our environment
				return SpyderInterpreter.theEnv.getValue(rs.getName());
			}
			catch(Exception e2)
			{
				throw new RuntimeException("Variable " + rs.getName() + " NOT FOUND!");
			}
		}
	}
	
	private static int getExpressionValue(Expression e)
	{
		if(e instanceof ResolveExpression)
		{
			return SpyderInterpreter.interpretResolveExpression((ResolveExpression)e);
		}
		else if(e instanceof LiteralExpression)
		{
			return SpyderInterpreter.interpretLiteralExpression((LiteralExpression) e);
		}
		else if(e instanceof DoMathExpression)
		{
			return SpyderInterpreter.interpretDoMathExpression((DoMathExpression) e);
		}
		else if(e instanceof TestExpression) {
			return SpyderInterpreter.interpretBooleanExpression((TestExpression) e);
		}
		throw new RuntimeException("Not a known expression type: " + e.getExpressionType());
	}
	
	private static void interpretRememberStatement(RememberStatement rs)
	{
		//we need to resolve this expression before we can actually remember anything
		Expression valueExpression = rs.getValueExpression();
		int answer = SpyderInterpreter.getExpressionValue(valueExpression);
		
		SpyderInterpreter.theEnv.addVariable(rs.getName(), answer);
		SpyderInterpreter.theOutput.add("<HIDDEN> Added " + rs.getName() + " = " + answer + " to the variable environment.");
	}
	
	private static void interpretQuestionStatement(QuestionStatement qs)
	{
		//we need to retrieve this expression before we can actually remember anything
		
		Expression booleanExpression = qs.getBooleanExpression();
		int answer = SpyderInterpreter.getExpressionValue(booleanExpression);
		String result;
		if(answer == 0) {
			result = "True";
		}else {
			result = "False";
		}
		//TODO Add remember functionality after finding true or fasle from interpretBooleanExpression
		//Just call the SpyderInterpreter.interpretRememberStatement((RememberStatement)s); and pass the correct remember Statement.
		System.out.println("answer "+result);
		
		Expression valueExpression = qs.getRememberStatement().getValueExpression();
		int updatedValue = SpyderInterpreter.getExpressionValue(valueExpression);
		try {
			SpyderInterpreter.theEnv.updateVariable(qs.getRememberStatement().getName(), updatedValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SpyderInterpreter.theOutput.add("<HIDDEN> Updated " + qs.getRememberStatement().getName() +
				" = " + qs.getRememberStatement().getValueExpression() + " to the variable environment.");
		


	}
}