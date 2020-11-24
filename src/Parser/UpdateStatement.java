package Parser;

public class UpdateStatement extends Statement{
	private String name;
	
	private Expression value;
	
	public UpdateStatement(String name, Expression value) {
		// TODO Auto-generated constructor stub
		super("Update Statement");
		this.name = name;
		this.value = value;
	}
	public String toString()
	{
		return super.toString() + "\n\t" + this.name + " = " + this.value;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the value
	 */
	public Expression getValueExpression() {
		return value;
	}

}
