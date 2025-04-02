package Exercise4;

public class Task3
{
	
	public static int removeDigit(int x, int rm_digit)
	{
		int result = 0;
		int tmp = x;
		
		while (tmp != 0)
		{
			int digit = tmp % 10;
			tmp /= 10;
			if(digit == rm_digit)
				continue;
			result = result * 10 + digit;	
		}
		
		
		// flip back the result
		tmp = result;
		result = 0;
		while (tmp != 0)
		{
			int digit = tmp % 10;
			result = result * 10 + digit;
			tmp /= 10;
		}
		
		return result;
	}
	

	public static void main(String[] args)
	{
		int res = removeDigit(123, 2);
		System.out.println(res);
		
		System.out.println(removeDigit(12345, 3));
		System.out.println(removeDigit(100105, 0));
		System.out.println(removeDigit(777, 7));
	}

}
