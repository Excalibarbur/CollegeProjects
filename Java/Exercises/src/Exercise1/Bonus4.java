package Exercise1;
import java.util.Scanner;

public class Bonus4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		
		System.out.print("Enter first number: ");
		a = scan.nextInt();
		System.out.print("Enter second number: ");
		b = scan.nextInt();
		
		int sum = a + b;
		int diff = a - b;
		
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + diff);
		
		scan.close();
	}

}
