package Exercise8;

public class Task2
{
	
	public static int countDigitsDivisibleByThree(int num)
	{
		int res = 0;
		if(num > 9)
			res = countDigitsDivisibleByThree(num / 10);
		
		int digit = num % 10;
		if(digit % 3 == 0)
			res++;
		
		return res;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(countDigitsDivisibleByThree(26492));
	}

}
