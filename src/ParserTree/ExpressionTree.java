package ParserTree;

import java.util.ArrayList;

public class ExpressionTree extends ExpressionPart {

	private ArrayList<ExpressionPart> expressionParts;
	
	public ExpressionTree(ArrayList<ExpressionPart> expressionParts) {
		// TODO Auto-generated constructor stub
		super("Expression Tree");
		this.expressionParts = expressionParts;
	}
	
	public String toString()
	{
		String ep = super.toString() + "\n\t"; 
		for(ExpressionPart expressionPart : this.expressionParts)
		{
			ep += expressionPart.toString() + "\n";
		}
		return ep;
	}
	
	/**
	 * @return the expressionParts
	 */
	public ArrayList<ExpressionPart> getExpressionParts() {
		return expressionParts;
	}
	

}
