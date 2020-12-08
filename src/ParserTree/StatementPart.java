package ParserTree;

public abstract class StatementPart extends PartTree{

	protected String statementPartType;
	
	public StatementPart(String statementPartType) {
		// TODO Auto-generated constructor stub
		super("StatementPart");
		this.statementPartType = statementPartType;
	}
	
	public String toString()
	{
		return super.toString() + this.statementPartType;
	}
	
	
	/**
	 * @return the statementPartType
	 */
	public String getStatementPartType() {
		return statementPartType;
	}

}
