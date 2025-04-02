package Exercise4;
import java.util.Scanner;

public class Task1
{
		
	public static int flip(int x)
	{
		int reverse = 0;
		
		while(x != 0)
		{
			int digit = x % 10;
			reverse = reverse * 10 + digit;
			x = x / 10;
		}
		
		return reverse;
	}
	
	public static int getNumOfDigits(int x)
	{
		int count = 0;
		
		while(x != 0)
		{
			count++;
			x /= 10;
		}
		
		return count;
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number to flip: ");
		int x = scan.nextInt();
		
		int flipped = flip(x);
		System.out.printf("Flipped: %d\n", flipped);
		
		// Incase of flipping number that ends with zeros, such as 100 -> 001
		int delta = getNumOfDigits(x) - getNumOfDigits(flipped);
		// Add padding zeros
		System.out.printf("Flipped: %0" + (delta + 1) + "d\n", flipped);
		
		scan.close();
	}

}



/* Messy but working, in-case of flipping numbers, such as 100, it will flip it to 001 instead of 1.
 * Also I didn't added it a proper function because of "instruction" may-be only one function.

int tmp = flipped;
int count = 0;
while(tmp != 0)
{
	count++;
	tmp /= 10;
}
int flipped_count = count;

count = 0;
tmp = x;
while(tmp != 0)
{
	count++;
	tmp /= 10;
}
int x_count = count;


System.out.print("Flipped: ");
if(flipped_count < x_count)
	for(int i = 0; i < (x_count - flipped_count); i++)
		System.out.print("0");
System.out.printf("%d\n", flipped);
*/ 
