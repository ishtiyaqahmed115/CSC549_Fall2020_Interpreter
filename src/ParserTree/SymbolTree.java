package ParserTree;

public class SymbolTree extends ExpressionPart{
	
	public String symbol;
	
	public SymbolTree(String symbol) {
		// TODO Auto-generated constructor stub
		super("Symbol Tree");
		this.symbol = symbol;
	}
	
	public String toString()
	{
		return super.toString() +" "+ this.getSymbol();
	}

	public String getSymbol() {
		return symbol;
	}
}
