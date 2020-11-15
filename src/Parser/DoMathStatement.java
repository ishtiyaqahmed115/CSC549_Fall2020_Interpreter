package Parser;

public class DoMathStatement extends Expression 
{
	private String name;
	private Expression e1;
	private Expression e2;
	private String operator;
	public static String identifier = "do-math";
	
	public DoMathStatement(String name)
	{
		super("Do-Math Statement");
		this.name = name;
		String[] parts = name.split("\\s+"); 
		for(int i = 0; i < parts.length; i++) {
			System.out.println("DoMath Constructor "+parts[i]);
		}
		
		e1 = new ResolveExpression(parts[1]);
		operator = parts[2];
		e2 = new ResolveExpression(parts[3]);
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + this.name;
	} 

	public String getName() 
	{
		return name;
	}
	/**
	 * @return the e1
	 */
	public Expression getE1() {
		return e1;
	}

	/**
	 * @return the e2
	 */
	public Expression getE2() {
		return e2;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}
	public static int DoMath(int e1, String operator, int e2) {
		int calculatedExpression = 0;
		if(operator.equals("+")) {
			calculatedExpression = e1 + e2;
		}
		else if (operator.equals("-")) {
			calculatedExpression = e1 - e2;
		}
		else if (operator.equals("*")) {
			calculatedExpression = e1 * e2;
		}
		else if (operator.equals("/")) {
			calculatedExpression = e1 / e2;
		}
		else if (operator.equals("%")) {
			calculatedExpression = e1 % e2;
		}
		return calculatedExpression;
		
	}
}
