package Exercise5;
import java.lang.Math;
import java.util.Scanner;

/*


n = 3

▢▢*			// 2 spaces | 1 stars
▢***		// 1 spaces | 3 stars
*****		// 0 spaces | 5 stars
▢***		// 1 spaces | 3 stars
▢▢*			// 2 spaces | 1 stars


stars += 2; // each time
stars -= 2; // after (stars * 2 - 1)


len = 3;
stars = 1;
spaces = 3 - 1;

len = 4;
stars = 3;
spaces = 4 - 3;

len = 5;
stars = 5;
spaces = 5 - 5;

len = 4;
stars = 3;
spaces = 4 - 3;

len = 3;
stars = 1;
spaces = 3 - 1;


len = input;
stars = i = 1;
spaces = len - stars;
if(stars == input * 2 - 1)
	flip();

if(!flipped)
	stars += 2;
else stars -= 2;

*/

public class Task4
{

	public static void printTriangle(int x)
	{
		// startEndPoint = x;
		int stars = 1;
		int max = x * 2 - 1;
		
		for(int i = x; i <= max; i++)
		{
			int spaces = Math.abs(i - stars);
			
			for(int j = 0; j < spaces; j++)
				System.out.print(" ");
			for(int j = 0; j < stars; j++)
				System.out.print("*");
			
			System.out.println("");
			
			if(i != max)
				stars += 2;
		}
		
		for(int i = max - 1; i >= x; i--)
		{
			stars -= 2;
			int spaces = Math.abs(i - stars);
			
			for(int j = 0; j < spaces; j++)
				System.out.print(" ");
			for(int j = 0; j < stars; j++)
				System.out.print("*");
			
			System.out.println("");
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
