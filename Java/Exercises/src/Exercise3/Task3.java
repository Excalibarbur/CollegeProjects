package Exercise3;
import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an integer greater than 3: ");
		int x = scan.nextInt();
		if(x < 3)
		{
			System.out.println("Error: input must be 3 or above");
			scan.close();
			return;
		}
		
		for(int i = 0; i < x; i++)
		{
			// If its the first OR the last line, print all line: 1
			if(i == 0 || i == x - 1)
			{
				for(int j = 0; j < x; j++)
					System.out.print("1 ");
			}
			else // If otherwise...
			{
				// For every digit in line
				for(int j = 0; j < x; j++)
				{
					// If its the First or Last digit, print a 1, else print a 0.
					if(j == 0 || j == x - 1)
						System.out.print("1 ");
					else System.out.print("0 ");
				}
			}
			
			// New line for each row of digit in the for-loop
			System.out.println(""); // New line
		}
		
		scan.close();
	}

}
