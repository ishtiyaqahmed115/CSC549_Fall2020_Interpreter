package ParserTree;

import java.util.ArrayList;

public class StatementTree extends StatementPart
{
	protected String statementTreetype;
	private ArrayList<PartTree> theComponents;
	
	public StatementTree(String statementTreetype)
	{
		super("Statement Tree"); //this line would automatically happen since we have a zero arg constructor
		this.statementPartType = statementTreetype;
		this.theComponents = new ArrayList<PartTree>();
	}

	public String toString()
	{
		return super.toString() + this.theComponents;
	}
}
