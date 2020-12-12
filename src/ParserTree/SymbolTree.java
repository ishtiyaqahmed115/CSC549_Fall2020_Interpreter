package ParserTree;

public class SymbolTree extends ExpressionPart
{
	private String theSymbol;
	
	public SymbolTree(String theSymbol)
	{
		super("Symbol Tree");
		this.theSymbol = theSymbol;
	}
	
	public String toString()
	{
		return super.toString() + " : " + this.theSymbol;
	}
}
