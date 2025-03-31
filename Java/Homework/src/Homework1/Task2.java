package Homework1;
import java.util.Scanner;

/*
 * Enter distance in kilometers: 20
 * The distance in miles is: 12.4274 miles
 * 
 * Output:
 * Enter distance in kilometers: 20
 * The distance in miles is: 12.4301 miles
 * - Seems like there's miss-match between the example to the result
 * 		because of the accuracy of the miles2km value, which supposed to be exactly "1.609344".
*/

public class Task2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float mile2km = 1.609f;
//		float mile2km = 1.609344f;
		
		System.out.print("Enter distance in kilometers: ");
		float miles_input = scan.nextFloat();
		
		float output = miles_input / mile2km;
		System.out.printf("The distance in miles is: %.4f miles\n", output);
	
		scan.close();
	}

}
