package ParserTree;

import java.util.ArrayList;

public class ProgramTree extends Object
{
	private ArrayList<StatementTree> theComponents;
	
	public ProgramTree()
	{
		super();
		this.theComponents = new ArrayList<StatementTree>();
	}
}
