package ParserTree;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramTree extends Object
{
	private ArrayList<StatementTree> theComponents;
	private ArrayList<String> theTokens;
	
	public ProgramTree(ArrayList<String> theTokens)
	{
		
		this.theComponents = new ArrayList<StatementTree>();
		this.theTokens = theTokens;
	}
	
	public void CreateParserTree() {
		CreateCorrespondingTree(theTokens);
	}
	
	public void DisplayParserTree() {
		for(StatementTree s : theComponents)
		{
			System.out.println(s);
		}
	}
	
	
	
	private void CreateCorrespondingTree(ArrayList<String> theTokens) {
		String firstTokenIdentifier = theTokens.get(0);

		if(LanguageCore.isReservedWord(firstTokenIdentifier)) {
			//Create the RememberStatementTree : "int" "a" "5"
			SymbolTree type = new SymbolTree(theTokens.get(1));
			SymbolTree varName = new SymbolTree(theTokens.get(2));
			LiteralExpressionTree value = new LiteralExpressionTree(theTokens.get(3));	
			
			RememberStatementTree rst = new RememberStatementTree(type , varName, value);
			//add this into statementTree
			theComponents.add(rst);
			
		
		}
	}
}
