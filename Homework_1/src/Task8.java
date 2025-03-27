import java.util.Scanner;

/*
 * 
 * 0. The 3 times loop is for failure checking or for total 3 uses ?
 * 1. Need to check if the "return; after 3rd time" is necessary ?
 * 2. Need to check if the results should start with "0" ?
 * 
 */

public class Task8
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		boolean valid = false;
		int lowerBound = 0, upperBound = 0;
		int tries = 0;
		
		while(!valid)
		{
			System.out.print("Enter the lower and upper bound for numbers: ");
			lowerBound = scan.nextInt();
			upperBound = scan.nextInt();
			
			// Error conditions
			if((lowerBound < 0 || upperBound < 0) || (lowerBound >= upperBound))
			{
				// Count fails and check if there's 3 of them
				if(++tries == 3)
				{
					/*
					 * יש שלשה נסיונות לקבלת קלט תקין.
					 * אז התוכנית תפסיק לקבל קלט ותוציא הודעה שגיאה ותסיים.
					*/
					System.out.println("Error, tried 3 times, exiting...");
					scan.close();
					return; // Program exit (Should I ? according to the instructions ?)
				}
				else // Regular error message according to the conditions.
					System.out.println("Error, please try again");
			}
			else // If there's no error, change the variable so the loop would end.
				valid = true;
		}
		
		
		boolean avoidFirstComma = false;	// For aesthetics :)
		boolean atleastOne = false; 		// If there's at-least one Armstrong number catch
		for(int currentNumber = lowerBound; currentNumber <= upperBound; currentNumber++)
		{
			// Get count of digit in the running-numbers
			int tmp = currentNumber;
			int count = 0;
			while(tmp != 0)
			{
				tmp /= 10;
				count++;
			}
			int N = count; // Define variable "N" as potential number

			
			tmp = currentNumber;	// Reset "tmp" to "currentNumber" (current number in loop) again
			int sum_total = 0;		// Variable to check the sum of every powered digit
			while(tmp != 0)
			{
				int digit = tmp % 10;				// The most right digit
				int sum = digit;					// Use variable "sum" as digit
				for(int j = 0; j < (N - 1); j++)	// Looping the N times... (minus one because it's already set to the number)
					sum *= digit;					// sum = sum^(main-number-length)
				sum_total += sum;					// Add the calculation to the total_sum for further use
				tmp /= 10;							// Update/Cut the running loop "tmp"
			}
			
			
			// Condition checks: "N" must be above 0 && (second + third) conditions, which are - combined.
			boolean firstCondition = (N > 0); // Is this relevant ? because the first Armstrong number is 0... (thought N number-group not always starts with a zero)
			firstCondition = true; // I've set the first condition to be always true because 0 it's part of the Armstrong numbers.
			if(firstCondition && (sum_total == currentNumber))
			{
				if(!avoidFirstComma)
					avoidFirstComma = true;
				else
					System.out.print(", ");
				
				System.out.print(currentNumber);
				atleastOne = true;
			}
		}
		
		if(!atleastOne)
			System.out.println("No Armstrong numbers in this range");
		
		scan.close();
	}

}
