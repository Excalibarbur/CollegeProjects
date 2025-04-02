package Exercise4;
import java.util.Scanner;

// This script only works for positive numbers as instructions says.

public class Task2
{

	public static boolean isPerfect(int x)
	{
		int globalSum = 0;
		int divide = x;
		
		while (divide != 1) // It will always end with 1 because the flooring (round up)
		{
			divide = (divide / 2) + (divide % 2); // Divide X by 2, AND add 1 if has decimal-point (round up)
			globalSum += divide; // Add the division to a variable to test if its sums are equal to X
		}
		
		if(globalSum == x)
			return true;
		
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to test if it's perfect: ");
		int x = scan.nextInt();
		
		if(isPerfect(x))
			System.out.printf("%d is perfect.\n", x);
		else System.out.printf("%d isn't perfect.\n", x);

		scan.close();
	}

}
