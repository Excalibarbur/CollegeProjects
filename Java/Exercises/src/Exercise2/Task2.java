package Exercise2;
import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers:");
		float number1 = scan.nextFloat();
		float number2 = scan.nextFloat();
		
		// This will print "true" if its answer the following conditions
		System.out.println(number1 >= 10 && number2 >= 10 && number1 <= 20 && number2 <= 20);
		
		scan.close();
	}

}
