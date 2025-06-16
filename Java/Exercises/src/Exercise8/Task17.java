package Exercise8;

public class Task17
{
	
	public static int sumDigits(int num)
	{
		int sum = 0;
		if(num > 9)
			sum = sumDigits(num / 10);
		
		sum += num % 10;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumDigits(1234));
	}

}
