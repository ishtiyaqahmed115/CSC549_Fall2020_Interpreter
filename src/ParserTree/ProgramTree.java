package ParserTree;
import java.util.ArrayList;

public class ProgramTree {

	private ArrayList<StatementTree> statementTrees;
	
	public ProgramTree(ArrayList<StatementTree> statementTrees) {
		// TODO Auto-generated constructor stub
		this.statementTrees = statementTrees;
	}
	
	
	public String toString()
	{
		return "ProgramTree: " + this.statementTrees;
	}
	
	/**
	 * @return the statementTrees
	 */
	public ArrayList<StatementTree> getStatementTrees() {
		return statementTrees;
	}

}
