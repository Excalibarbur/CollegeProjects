package Exercise6;

public class Task2
{
	
	public static boolean fn2(int x)
	{
		// true  == ספרות בסדר יורד
		int big = x % 10;
		x /= 10; // update after chop
		
		while(x != 0)
		{
			int digit = x % 10;
			
			if(digit > big)
				big = digit;
			else
				return false;
			
			x /= 10;
		}
		
		return true;
	}

	public static void main(String[] args)
	{
		int x1 = 123456, x2 = 654321;
		System.out.printf("1st: (%d) - %b\n", x1, fn2(x1));
		System.out.printf("2nd: (%d) - %b\n", x2, fn2(x2));
	}

}
