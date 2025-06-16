package Homework4;

public class a3
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
		String text = "This is a test string";
        String word = "test";
        System.out.println("Word found: " + searchWord(text, word)); // Word found: true
	}

}
