package Exercise8;

public class Task11
{

	public static boolean isCODUser(String str)
	{
		boolean res = true;
		
		if(str.length() != 1)
			res = isCODUser(str.substring(1));
		
		if(res == false)
			return false;
		
		char c = str.charAt(0);
		if(c >= 'A' && c <= 'Z')
			return true;
		
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isCODUser("PLUH"));
	}

}
