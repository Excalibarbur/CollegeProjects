package Exercise3;
import java.util.Scanner;

public class Task6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = scan.nextInt();
		
		int count = 0;
		while(input != 0)
		{
			int digit = input % 10;
			if(digit == 7)
				count++;
			input /= 10;
		}
		
		System.out.printf("The digit 7 appears %d times.\n", count);
		scan.close();
	}

}
