package ParserTree;

import java.util.ArrayList;

public class ExpressionTree extends ExpressionPart
{
	private ArrayList<ExpressionPart> theComponents;
	
	public ExpressionTree()
	{
		super("Expression Tree");
		this.theComponents = new ArrayList<ExpressionPart>();	
	}
}
