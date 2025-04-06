package Exercise1;
import java.util.Scanner;

public class Bonus3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		
		int squared = input * input;
		System.out.printf("The square of %d is %d\n", input, squared);
		
		scan.close();
	}

}
