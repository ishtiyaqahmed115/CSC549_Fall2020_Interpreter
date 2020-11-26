package Parser;

public class RepeatStatement extends Statement{
	private TestExpression testExpression;
	private Statement updateStatement;

	public RepeatStatement(TestExpression testExpression, Statement updateStatement) {
		// TODO Auto-generated constructor stub
		super("Question Statement");
		this.testExpression = testExpression;
		this.updateStatement = updateStatement;
		
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.testExpression.toString() +
				"\n\t\t" + this.updateStatement.toString();				
	}
	/**
	 * @return the testExpression
	 */
	public TestExpression getTestExpression() {
		return testExpression;
	}

	/**
	 * @return the updateStatement
	 */
	public Statement getUpdateStatement() {
		return updateStatement;
	}


}
