package ParserTree;

public class RememberStatementTree extends StatementTree {
	private SymbolTree type;
	private SymbolTree varName;
	private LiteralExpressionTree expression;

	public RememberStatementTree(SymbolTree type, SymbolTree varName, LiteralExpressionTree expression) {
		// TODO Auto-generated constructor stub
		super("Remember Statement Tree");
		this.type = type;
		this.varName = varName;
		this.expression = expression;
	}
	public String toString()
	{
		return super.toString() + "\t\n" + 
	this.type.toString() + " " + this.varName.toString() + " " + this.expression.toString();
	}
	/**
	 * @return the type
	 */
	public SymbolTree getType() {
		return type;
	}

	/**
	 * @return the varName
	 */
	public SymbolTree getVarName() {
		return varName;
	}

	/**
	 * @return the expression
	 */
	public LiteralExpressionTree getExpression() {
		return expression;
	}


}
