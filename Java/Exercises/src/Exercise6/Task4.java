package Exercise6;

public class Task4
{
	
	public static double fn4(int x)
	{
		int count = 0;
		double total = 0;
		
		while(x != 0)
		{
			total += x % 10;
			count++;
			x /= 10;
		}
		
		return (total / count);
	}

	public static void main(String[] args)
	{
		System.out.println(fn4(1233456));
	}

}
