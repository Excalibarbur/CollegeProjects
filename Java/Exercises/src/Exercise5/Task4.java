package Exercise5;
import java.util.Scanner;

// I've updated it to a better looking code :>

public class Task4
{
	
	public static void printTriangleVisually(int spaces, int stars)
	{
		for(int j = 0; j < spaces; j++)
			System.out.print(" ");
		for(int j = 0; j < stars; j++)
			System.out.print("*");
		System.out.println("");
	}

	public static void printTriangle(int startPoint)
	{
		int max = startPoint * 2 - 1;
		int stars = 1;
		boolean switchUp = false;
		
		for(int i = startPoint; i < (max * 2 + 1); i++)
		{
			// max - i = spaces
			// 5 - 3 = 2
			// 5 - 4 = 1
			// 5 - 5 = 0
			// 5 - 6 = -1
			// 5 - 7 = -2
			
			int spaces = Math.abs(max - i);
			printTriangleVisually(spaces, stars);
			
			if(stars == max)
				switchUp = true;
			
			if(!switchUp)
				stars += 2;
			else stars -= 2;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		
		printTriangle(input);
		
		scan.close();
	}

}
