package ParserTree;

import java.util.ArrayList;

public class StatementTree extends StatementPart
{
	private ArrayList<PartTree> theComponents;
	
	public StatementTree()
	{
		super(); //this line would automatically happen since we have a zero arg constructor
		this.theComponents = new ArrayList<PartTree>();
	}
}
