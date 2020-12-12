package ParserTree;

public abstract class StatementPart extends PartTree
{
	protected String statementPartType;

	public StatementPart(String statementPartType)
	{
		super("StatementPart");
		this.statementPartType = statementPartType;
	}
	
	public String toString()
	{
		return "\n\t" + this.statementPartType;
	}
}

