package Homework4;

public class ex2
{
	
	public static boolean isPalindrome(String str)
	{
		// If its even it will be 0 length or 1 if its even
		if(str.length() <= 1)
			return true;
		
		// Compare characters from the sides
		char mostRight = str.charAt(0);
		char mostLeft = str.charAt(str.length() - 1);	
		if(mostRight != mostLeft)
			return false;
		
		// Construct the next string to search recursive on
		String nextStr = str.substring(1, str.length() - 1);
		return isPalindrome(nextStr);
	}
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("adada"));
	}

}
