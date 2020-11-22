package Parser;

public class QuestionStatement extends Statement{
	
	private Expression booleanExpression;

	

	public QuestionStatement(Expression booleanExpression) {
		// TODO Auto-generated constructor stub
		super("Question Statement");
		this.booleanExpression = booleanExpression;
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

}
