package ParserTree;

public class LiteralExpressionTree extends ExpressionPart {

	protected String value;
	
	public LiteralExpressionTree(String value) {
		// TODO Auto-generated constructor stub
		super("Literal Expression");
		this.value = value;
	}

	
	public String toString()
	{
		return super.toString() + " : " + this.value;
	}

}
