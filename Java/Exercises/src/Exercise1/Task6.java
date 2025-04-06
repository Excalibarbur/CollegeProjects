package Exercise1;
import java.util.Scanner;

public class Task6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number (int) [3-digit]: ");
		int input = scan.nextInt();
		
		// First method
		int d1 = input % 10;
		int d2 = (input % 100 - d1) / 10;
		int d3 = (input % 1000 - input % 100) / 100;
		System.out.printf("%d%d%d\n", d1, d2, d3);
		
		// Second method
		int tmp = input;
		int reverse = 0;
		while(tmp != 0)
		{
			int digit = tmp % 10;
			reverse = reverse * 10 + digit;
			tmp /= 10;
		}
		System.out.println(reverse);
		
		scan.close();
	}

}
