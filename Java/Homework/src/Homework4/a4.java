package Homework4;

public class a4
{

	public static String getEvenIndexLetters(String str, int index, String out)
	{
		if(index >= str.length())
			return out;
		
		if(index % 2 != 0)
			return getEvenIndexLetters(str, index + 1, out);
		
		out += str.charAt(index);
		
		return getEvenIndexLetters(str, index + 1, out);
	}
	
	public static String getEvenIndexLetters(String str)
	{
		return getEvenIndexLetters(str, 0, "");
	}
	
	
	public static void main(String[] args)
	{
		String str = "Hello world";
        System.out.println("Even index letters: " + getEvenIndexLetters(str)); // Even index letters: Hlowrd
	}

}
