package Exercise8;

public class Task13
{

	public static boolean isAscending(int num)
	{
		boolean res = true;
		if(num > 9)
			res = isAscending(num / 10);
		
		if(res == false)
			return false;
		
		int currDigit = num % 10;
		int lastDigit = (num / 10) % 10;
		if(currDigit < lastDigit)
			res = false;
		
		return res;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(isAscending(123956));
	}

}
