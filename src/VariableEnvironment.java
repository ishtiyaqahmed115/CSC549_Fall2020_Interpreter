import java.util.ArrayList;

public class VariableEnvironment 
{
	private ArrayList<NameValuePair> theVariables;
	
	public VariableEnvironment()
	{
		this.theVariables = new ArrayList<NameValuePair>();
	}
	
	public void display()
	{
		for(NameValuePair nvp : this.theVariables)
		{
			nvp.display();
		}
		
	}
	
	//take in a name and a value and create a NameValuePair and add
	//it to theVariables
	public void addVariable(String name, int value)
	{
		NameValuePair nvp = new NameValuePair(name, value);
		theVariables.add(nvp);
	}
	
	//take in a name and it should retrieve the value associated
	//with that variable name.  For now, you can assume that
	//any name you look for, will be found.
	public int getValue(String name)
	{
		int value = 0;
		for(int i =0 ; i< theVariables.size(); i++) {
			if(name == theVariables.get(i).getName()) {
				value = theVariables.get(i).getValue();
			} 
		}
		return value;
		
	}
}
