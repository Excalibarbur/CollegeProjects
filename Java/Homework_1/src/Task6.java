import java.util.Scanner;

/*
 * This code scripted very silly :D
 * 
*/

public class Task6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x, y;
		while(true)
		{
			System.out.print("Enter two different integers: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(y == x)
				System.out.println("Error: The numbers must be different. Please enter two different numbers.");
			else break;
		}
		
		// Create a copy variables for the inputs (x, y)
		int cpX = x;
		int cpY = y;
		
		// Incase of inquality - break and set the response to be "fail" scenario.
		boolean isSetEqual = true;
		
		// Loop in every number in X variable
		while(x != 0 && isSetEqual)
		{
			// The most right num of X
			int r = x % 10;
//			System.out.println("[X]-> " + r); // Logging current r-value of X
			
			// Update X to be... shorter
			x /= 10;

			// Define a condition that wait for "isContain" to be true - to determine the result of "isSetEqual"
			boolean isContain = false;
			
			// Restore Y after previous use
			y = cpY;
			
			// Loop in every number in Y (loop in loop)
			while(y != 0 && !isContain)
			{
				// If the "right number" of X found in current looping-Y loop, set the result of "isSetEqual" to be true
				// Else - Cut the next right number of Y and update Y
				int ry = y % 10;
//				System.out.println("\t[Y]-> " + ry); // Logging Y
				if(r == ry || -r == ry)
					isContain = true;
				else
					y /= 10;
			}
			
			// Finally - sets the final result depends if every integer is contained.
			isSetEqual = isContain;
		}
		
		
		// Do the same, but in reverse (Y in X)
		// Restore Y to its original input value
//		System.out.println(""); // Space for the logging
		y = cpY;
		while(y != 0 && isSetEqual)
		{
			int r = y % 10;		// The most right num of X
//			System.out.println("[Y]-> " + r); // Logging current r-value of Y
			y /= 10;			// Update X to be... shorter
			boolean isContain = false;
			x = cpX; 			// Restore X after previous use
			
			while(x != 0 && !isContain)
			{
				int rx = (x % 10);
//				System.out.println("\t[X]-> " + rx); // Logging Y
				if(r == rx || -r == rx)
					isContain = true;
				else
					x /= 10;
			}
			
			isSetEqual = isContain;
		}
		
		
		if(isSetEqual)
			System.out.println("Both numbers are composed of identical digits.");
		else
			System.out.println("The numbers are composed of different digits.");
		
		scan.close();
	}

}
