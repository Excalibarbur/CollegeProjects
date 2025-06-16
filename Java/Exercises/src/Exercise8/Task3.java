package Exercise8;

public class Task3
{
	
	public static boolean isPalindrome(String str)
	{
		if(str.length() < 2)
			return true;
		
		char right = str.charAt(0);
		char left = str.charAt(str.length() - 1);
		
		if(right != left)
			return false;
		
		String updatedString = str.substring(1, str.length() - 1);
		return isPalindrome(updatedString);
	}

	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("adda"));
	}

}
