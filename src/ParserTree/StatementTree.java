package ParserTree;
import java.util.ArrayList;

public class StatementTree extends StatementPart {

	
	private ArrayList<PartTree> partTrees;
	
	public StatementTree(ArrayList<PartTree> partTrees) {
		// TODO Auto-generated constructor stub
		super("Statement Tree");
		this.partTrees = partTrees;
	}
	public String toString()
	{
		String pt = super.toString() + "\n\t"; 
		for(PartTree partTree : this.partTrees)
		{
			pt += partTree.toString() + "\n";
		}
		return pt;
	}
	
	/**
	 * @return the partTrees
	 */
	public ArrayList<PartTree> getPartTrees() {
		return partTrees;
	}

}
