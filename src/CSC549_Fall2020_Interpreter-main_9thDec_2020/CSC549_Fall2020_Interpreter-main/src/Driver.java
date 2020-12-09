import Parser.*;
import ParserTree.LanguageCore;
import ParserTree.PartTree;

public class Driver 
{

	public static void main(String[] args) 
	{
		System.out.println(LanguageCore.isReservedWord("remember"));
		System.out.println(LanguageCore.isReservedWord("woot"));
		//Parser.parse("input.spyder");
		//Parser.display();
		//Interpreter.SpyderInterpreter.interpret(Parser.getParsedStatements());
		//Interpreter.SpyderInterpreter.displayResults();		
	}
}
