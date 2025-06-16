package Homework4;

public class ex2
{
	
	public static boolean isPalindrome(String str, int index)
	{
		if(index >= str.length() / 2)
			return true;
		
		char first = str.charAt(index);
		char last = str.charAt(str.length() - 1 - index);
		
		if(first != last)
			return false;
		
		return isPalindrome(str, index + 1);
	}
	
	public static boolean isPalindrome(String str)
	{
		return isPalindrome(str, 0);
	}


	public static void main(String[] args)
	{
		System.out.println(isPalindrome("adada"));
		System.out.println(isPalindrome("adjda"));
		System.out.println(isPalindrome("adda"));
		System.out.println(isPalindrome("acada"));
		
	}

}
