package Exercise5;
import java.util.Scanner;

// I code it like garbage but idk, its works

public class Task4
{

	public static void printTriangle(int x)
	{
		boolean flipped = false;
		int stars = 1;
		int index = x;
		int max = x * 2 - 1;
		
		while(true)
		{
			int spaces = index - stars;
			
			for(int j = 0; j < spaces; j++)
				System.out.print(" ");
			for(int j = 0; j < stars; j++)
				System.out.print("*");
			System.out.println("");
			
			if(stars == max)
				flipped = true;
			
			if(!flipped)
			{
				index++;
				stars += 2;
			}
			else 
			{
				index--;
				if(stars == 1)
					break;
				else stars -= 2;
			}
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
