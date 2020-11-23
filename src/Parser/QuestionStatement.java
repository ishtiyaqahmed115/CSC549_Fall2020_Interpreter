package Parser;

public class QuestionStatement extends Statement{
	
	private Expression booleanExpression;
	private RememberStatement rememberStatement;

	

	

	public QuestionStatement(Expression booleanExpression, RememberStatement rememberStatement) {
		// TODO Auto-generated constructor stub
		super("Question Statement");
		this.booleanExpression = booleanExpression;
		this.rememberStatement = rememberStatement;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + " = " + this.booleanExpression;
	}
	
	/**
	 * @return the booleanExpression
	 */
	public Expression getBooleanExpression() {
		return booleanExpression;
	}

	/**
	 * @return the rememberStatement
	 */
	public RememberStatement getRememberStatement() {
		return rememberStatement;
	}
}
