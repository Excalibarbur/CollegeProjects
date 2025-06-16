package Exercise8;

public class Task4
{

	public static String deleteChar(String str, char ch)
	{
		String res = "";
		
		if(str.length() > 1)
			res = deleteChar(str.substring(0, str.length() - 1), ch);
		
		char let = str.charAt(str.length() - 1);
		if(let != ch)
			res += let;
			
		return res;
	}
	

	public static void main(String[] args)
	{
		System.out.println(deleteChar("level", 'l'));
	}

}
