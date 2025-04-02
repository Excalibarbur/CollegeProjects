package Exercise4;

public class Task4
{

	public static int removeMinMax(int x)
	{
		int result = 0;
		
		int digit = x % 10;
		int min = digit;
		int max = digit;
		
		int tmp = x;
		int flipped = 0;
		while(tmp != 0)
		{
			digit = tmp % 10;
			if(digit < min)
				min = digit;
			else if(digit > max)
				max = digit;
			flipped = flipped * 10 + digit;
			tmp /= 10;
		}
//		System.out.printf("Min: %d\tMax: %d\n", min, max);

		
		tmp = flipped;
		while(tmp != 0)
		{
			digit = tmp % 10;
			tmp /= 10;
			if(digit == min || digit == max)
				continue;
			result = result * 10 + digit;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int removedMinMax = removeMinMax(123456);
		System.out.println(removedMinMax);
	}

}
