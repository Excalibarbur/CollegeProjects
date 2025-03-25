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
*/


/*
 * Conditions:
 * 	1. Must be 3 digit number
 *  2. Valid splits are: 1, 2, 5, 10, 20, 50, 100, 200
 *  
 *  
 */

public class Task4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int num = scan.nextInt();
		if(num / 100 >= 1 && num / 100 < 10)
		{
			// need to work on
			/*while(true)
			{
				scan:
					if(num / 200 >= 1)
					{
						System.out.printf("%d Note(s) of 200.0", (num % 200));
						num = num % 200; // update num to its delta
						break scan;
						
					}
					else if(num / 100 >= 1)
					{
						int delta = num % 100;
					}
			}*/
		}
		else
			System.out.println("Error");
	}

}
