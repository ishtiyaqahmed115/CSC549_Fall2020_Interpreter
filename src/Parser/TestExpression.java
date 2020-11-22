package Parser;

public class TestExpression extends Expression{
	private Expression leftExpression;
	

	private Expression rightExpression;
	private String logicalOperator;

	public TestExpression(Expression leftExpression, String logicalOperator, Expression rightExpression) {
		// TODO Auto-generated constructor stub
		super("Test Expression");
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.logicalOperator = logicalOperator;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + this.leftExpression.toString() + " "
				+ this.logicalOperator + " " + this.rightExpression.toString();
	}
	
	/**
	 * @return the leftExpression
	 */
	public Expression getLeftExpression() {
		return leftExpression;
	}

	/**
	 * @return the rightExpression
	 */
	public Expression getRightExpression() {
		return rightExpression;
	}

	/**
	 * @return the logicalOperator
	 */
	public String getLogicalOperator() {
		return logicalOperator;
	}

}
