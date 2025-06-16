package Homework4;

public class ex3
{

	public static boolean searchWord(String[] str_arr, String word, int index)
	{
		if(index == str_arr.length)
			return false;
		
		if(str_arr[index].toLowerCase().equals(word.toLowerCase()))
			return true;
		
		return searchWord(str_arr, word, index + 1);
	}
	
	public static boolean searchWord(String text, String word)
	{
		String words[] = text.split(" ");
		return searchWord(words, word, 0);
	}
	

	public static void main(String[] args)
	{
		System.out.println(searchWord("Hey man whats up", "man"));
		System.out.println(searchWord("Hey man whats up", "dan"));
		System.out.println(searchWord("Hey man whats up", "an"));
		
	}

}
