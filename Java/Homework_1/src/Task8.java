import java.util.Scanner;

/*
 * I've avoided the use of "return;" function, because it wasn't included in our previous class.
*/

public class Task8
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int lowerBound = 0, upperBound = 0;
		int tries = 0;
		final int MAX_TRIES = 3;
		
		// Switched to while-"true" because I depending on "break"-s.
		while (true)
		{
			System.out.print("Enter the lower and upper bound for numbers: ");
			lowerBound = scan.nextInt();
			upperBound = scan.nextInt();
			
			// Error conditions
			if((lowerBound < 0 || upperBound < 0) || (lowerBound >= upperBound))
			{
				// Increase "tries" by one - after fail.
				tries++;
				if(tries == MAX_TRIES) // Compare "tries" to "3", in-case "tries" will reach to 3, break the while loop.
					break;
				else // Regular error message according to the conditions.
					System.out.println("Error, please try again");
			}
			else // If there's no error, break, so the loop would end.
				break; 
		}
		
		// If the "tries" will reach 3 - exit.
		if(tries == MAX_TRIES)
			System.out.println("Error, tried 3 times, exiting...");
		else // Inputs are valid with no errors - start script.
		{
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
				
				
				// Condition checks: "N" must be 0 or above && (second + third) conditions, which are - combined.
				if((N >= 0) && (sum_total == currentNumber))
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
			else
				System.out.println(""); // adds a new line after printing the results
		}
		
		scan.close();
	}

}
