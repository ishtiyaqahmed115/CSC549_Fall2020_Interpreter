import Parser.*;

public class Driver 
{

	public static void main(String[] args) 
	{
		
		//Parser.parse("input.spyder");
		Parser.parseParseTree("ParserTree.spyder");
		//Pass the Token List to ProgramTree.
		ParserTree.ProgramTree pt = new ParserTree.ProgramTree(Parser.getTheListOfTokens());
		pt.CreateParserTree();
		pt.DisplayParserTree();
		//Parser.display();
		//Interpreter.SpyderInterpreter.interpret(Parser.getParsedStatements());
		//Interpreter.SpyderInterpreter.displayResults();
		
		
	}
}
