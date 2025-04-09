package Exercise5;
import java.lang.Math;

public class Task6
{
	
	public static int rand(int min, int max)
	{
		return (int)(Math.random() * (max - min + 1) + min);
	}
	
	public static boolean isPrime(int x)
	{
		int sqrt = (int)Math.sqrt(x);    // rounds the input-parameter
		for(int i = 2; i <= sqrt; i++)   // seek if the round square-root can be divided by a range of numbers
		{
			if(x % i == 0)
				return false;
		}
		return true;
	}

	public static void generateAndCheckPrimes()
	{
		for(int i = 1; i <= 10; i++)
		{
			int randNum = rand(10, 100);
			System.out.printf("[%2d.]  %3d [Prime: %b]\n", i, randNum, isPrime(randNum));
		}
	}
	
	public static void main(String[] args)
	{
		generateAndCheckPrimes();
	}

}
