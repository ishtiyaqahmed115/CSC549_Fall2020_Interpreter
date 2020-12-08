package ParserTree;

public abstract class ExpressionPart extends PartTree{
	
	public String expressionPartType;

	

	public ExpressionPart(String expressionPartType) {
		// TODO Auto-generated constructor stub
		super("ExpressionPart");
		this.expressionPartType = expressionPartType;
	}
	
	public String toString()
	{
		return super.toString() + this.expressionPartType;
	}
	
	/**
	 * @return the expressionPartType
	 */
	public String getExpressionPartType() {
		return expressionPartType;
	}

}
