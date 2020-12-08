package ParserTree;

public abstract class PartTree {

	protected String partType;

	public PartTree(String partType) {
		// TODO Auto-generated constructor stub
		this.partType = partType;
	}
	
	
	public String toString()
	{
		return "Part Tree : " + this.partType;
	}
	
	/**
	 * @return the partType
	 */
	public String getPartType() {
		return partType;
	}

}
