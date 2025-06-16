package Homework4;

public class a2
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
		String str1 = "abba";
        String str2 = "t6r6t";
        String str3 = "hello";
        System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1)); // Is "abba" a palindrome? true
        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2)); // Is "t6r6t" a palindrome? true
        System.out.println("Is \"" + str3 + "\" a palindrome? " + isPalindrome(str3)); // Is "hello" a palindrome? false		
	}

}
