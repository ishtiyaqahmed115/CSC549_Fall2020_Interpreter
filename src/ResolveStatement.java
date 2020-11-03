
public class ResolveStatement extends Statement{
	private String name;

	public ResolveStatement(String name) {
		// TODO Auto-generated constructor stub
		super("Resolve Statement");
		this.name = name;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + " " + this.name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	

}
