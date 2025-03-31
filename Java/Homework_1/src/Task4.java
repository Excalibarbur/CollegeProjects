import java.util.Scanner;

/*
 * Enter a three-digit number: 258
 * 1 Note(s) of 200.0
 * 0 Note(s) of 100.0
 * 1 Note(s) of 50.0
 * 0 Note(s) of 20.0
 * 0 Note(s) of 10.0
 * 1 Note(s) of 5.0
 * 1 Note(s) of 2.0
 * 1 Note(s) of 1.0
 *
 * Enter a three-digit number: 42
 * Error
 * 
*/


/*
 * Conditions:
 * 	1. Must be 3 digit number
 *  2. Valid splits are: 1, 2, 5, 10, 20, 50, 100, 200
 *  
 */

public class Task4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int num = scan.nextInt();
		if(num >= 100 && num < 1000)
		{
			int is200 = (num / 200);
			System.out.printf("%d Note(s) of 200.0\n", is200);
			
			if(is200 >= 1)
				num = num % 200; // update - delta
			
			
			// -- -- --
			
			
			int is100 = (num / 100);
			System.out.printf("%d Note(s) of 100.0\n", is100);

			if(is100 >= 1)
				num = num % 100; // delta
			
			
			// -- -- --
			
			
			int is50 = (num / 50);
			System.out.printf("%d Note(s) of 50.0\n", is50);

			if(is50 >= 1)
				num = num % 50; // delta
			
			
			// -- -- --
			
			
			int is20 = (num / 20);
			System.out.printf("%d Note(s) of 20.0\n", is20);

			if(is20 >= 1)
				num = num % 20; // delta

			
			// -- -- --
			
			
			int is10 = (num / 10);
			System.out.printf("%d Note(s) of 10.0\n", is10);

			if(is10 >= 1)
				num = num % 10; // delta
			
			
			// -- -- --
			
			
			int is5 = (num / 5);
			System.out.printf("%d Note(s) of 5.0\n", is5);

			if(is5 >= 1)
				num = num % 5; // delta
			
			
			// -- -- --
			
			
			int is2 = (num / 2);
			System.out.printf("%d Note(s) of 2.0\n", is2);
			
			if(is2 >= 1)
				num = num % 2; // delta
			
			
			// -- -- --
			
			
			int is1 = (num / 1);
			System.out.printf("%d Note(s) of 1.0\n", is1);
			// No need to update the delta
			
			
			// -- -- --
		}
		else System.out.println("Error");
		
		scan.close();
	}

}
