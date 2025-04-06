package Exercise2;
import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = scan.nextInt();
		
		if(input % 2 == 0)
			System.out.println("This is an even number.");
		else
			System.out.println("This is an odd number.");
		
		scan.close();
	}

}
