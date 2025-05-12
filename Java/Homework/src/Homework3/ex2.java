package Homework3;
import java.util.Scanner;

public class ex2
{
	
	public static int getDivisors(int input)
	{
		if(input > 1)
		{
			int count = 0;
			for(int i = input; i != 0; i--)
				if(input % i == 0)
					count++;
			
			return count;
		}
		else
			return -1;
	}
	
	public static void printMatrix(int[][] matrix)
	{
		int max = Integer.MIN_VALUE;
		
		// Get Max
		for(int i = 0; i < matrix[1].length; i++)
		{
			if(matrix[1][i] > max)
				max = matrix[1][i];
		}
		
		// Print Max
		System.out.println("\nMaximal number of divisors is: " + max);
		
		// Find numbers that has Max and print their main number
		for(int i = 0; i < matrix[1].length; i++)
		{
			if(matrix[1][i] == max)
				System.out.printf("%d has %d divisors.\n", matrix[0][i], max);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter low integer: ");
		int low = scan.nextInt();
		
		System.out.print("Enter high integer: ");
		int high = scan.nextInt();
		
		int[][] matrix = new int[2][high-low+1];
		
		for(int i = 0; i <= high - low; i++)
			matrix[0][i] = low + i;
		
		for(int i = 0; i < matrix[0].length; i++)
			matrix[1][i] = getDivisors(matrix[0][i]);
		
		printMatrix(matrix);
		
		scan.close();
	}

}
