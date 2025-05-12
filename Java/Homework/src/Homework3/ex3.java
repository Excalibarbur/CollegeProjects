package Homework3;
import java.util.Scanner;

public class ex3
{
	
	public static boolean isPrime(int num)
	{
		if(num == 1)
			return true;

		for(int i = num - 1; i != 1; i--)
		{
			if(num % i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 16 integers: ");
		
		int[][] inputs = new int[4][4];
		
		// Load-up the numbers from console-input
		for(int i = 0; i < 16; i++)
		{
			int row = (int)(i / 4);
			int index = i % 4;
			inputs[row][index] = scan.nextInt();
		}
		
		
		// Print Matrix
		for(int[] line : inputs)
		{
			for(int i = 0; i < line.length; i++)
			{
				System.out.printf("%d\t%s", line[i], ((i == line.length - 1) ? "\n" : " "));
			}
		}
		
		
		// Scan for primes
		boolean allPrimes = true; // true by default
		for(int i = 0; i < inputs.length; i++)
		{
			int[] row = inputs[i];
			if(i == 0 || i == inputs.length - 1)
			{
				for(int j = 0; j < row.length; j++)
				{
					if(!isPrime(row[j]))
					{
						allPrimes = false;
						break; // break from the line-loop
					}
				}
			}
			else
			{
				int first = row[0];
				int last = row[row.length - 1];
				
				if(!isPrime(first) || !isPrime(last))
					allPrimes = false;
			}
			
			if(allPrimes == false)
				break;
		}
		
		System.out.println(allPrimes);
		
		scan.close();
	}

}
