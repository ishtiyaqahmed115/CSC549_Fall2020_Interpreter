package ParserTree;

public abstract class PartTree extends Object
{
	protected String partType;
	
	public PartTree(String partType)
	{
		super();
		this.partType = partType;
	}
	
	public String getPartType() {
		return partType;
	}
}
