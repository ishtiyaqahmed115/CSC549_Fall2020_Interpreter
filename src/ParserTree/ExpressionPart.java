package ParserTree;

public abstract class ExpressionPart extends PartTree 
{
	protected String espressionPartType;
	
	public ExpressionPart(String espressionPartType)
	{
		super("ExpressionPart");
		this.espressionPartType = espressionPartType;
	}
	public String toString()
	{
		return "\n"+ "\t" + this.espressionPartType;
	}
}
