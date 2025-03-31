import java.util.Scanner;

/*
 * Enter exchange rate (USD to NIS): 3.5
 * Enter amount in USD: 100
 * The amount in NIS is: 350.00
*/

public class Task1
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter exchange rate (USD to NIS): ");
		float usd_value = scan.nextFloat();
		
		System.out.print("Enter amount in USD: ");
		float usd_input = scan.nextFloat();
		
		float nis_output = usd_value * usd_input;
		System.out.printf("The amount in NIS is: %.2f\n", nis_output);
	
		// By the example - it's seems like the result should be with 2 decimal digits after the calculation, therefore I used "%.2f".
		
		scan.close();
	}

}
