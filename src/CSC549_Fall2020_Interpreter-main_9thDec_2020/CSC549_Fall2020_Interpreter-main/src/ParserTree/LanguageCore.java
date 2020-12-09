package ParserTree;

//a singleton that can be used by any of our classes to directly ask
//questions currently about what is a reserved word etc...
//you can certainly put additional things in here if you would like

public class LanguageCore 
{
	private static String[] theReservedWords = {"=","remember", ";"};
	
	public static boolean isReservedWord(String s)
	{
		//returns true if s is one of the reserved words
		//and false otherwise
		for(int i = 0; i < LanguageCore.theReservedWords.length; i++)
		{
			if(LanguageCore.theReservedWords[i].equals(s))
			{
				return true;
			}
		}
		return false;
	}
}
