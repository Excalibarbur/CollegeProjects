package Exercise7;
import java.lang.Math;
// import java.util.Random;

public class Task4
{

	public static void main(String[] args)
	{
		int arr[][] = new int[6][6];
//		Random rand = new Random(7); // I've used Random-Class for constant result
		
		// Assign random values into the matrix
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = (int)(/*rand.nextFloat(1)*/Math.random() * (50 - 10) + 10);
		
		
		// Print the matrix
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

		
		// Calculate & print the result
		//		- Last_Column = Line.length
		// 		- Line 0 : Column [Last_Column - 0]
		// 		- Line 1 : Column [Last_Column - 1]
		// 		- Line 2 : Column [Last_Column - 2]
		//		...
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i][(arr.length - 1) - i];
		
		System.out.printf("\nSum: -> %d", sum);
		
	}

}
