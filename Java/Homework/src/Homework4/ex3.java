package Homework4;

public class ex3
{
	
	/*
	 * Hey Man -> hey man
	 * (Search: man)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static boolean searchWord(String text, String word)
	{
		String words[] = text.split(" ");
		
		if(words.length == 0 || text.equals(""))
			return false;
		
		String firstWord = words[0];
		if(firstWord.toLowerCase().equals(word))
			return true;
		
		String newStr = "";
		for(int i = 1; i < words.length; i++)
			newStr += words[i] + ((i == words.length - 1) ? "" : " ");
		
		return searchWord(newStr, word);
	}

	public static void main(String[] args)
	{
		System.out.println(searchWord("Hey man whats up", "man"));
	}

}
