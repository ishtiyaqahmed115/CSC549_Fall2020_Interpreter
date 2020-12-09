package Parser;

import java.util.ArrayList;

public class BlockStatement extends Statement
{
	private ArrayList<Statement> statements;
	
	public BlockStatement(ArrayList<Statement> statements)
	{
		super("Block Statement");
		this.statements = statements;
	}

	public String toString()
	{
		String s = super.toString() + "\n\t"; 
		for(Statement stmt : this.statements)
		{
			s += stmt.toString() + "\n";
		}
		return s;
	}

	public ArrayList<Statement> getStatements() {
		return statements;
	}

	
}



