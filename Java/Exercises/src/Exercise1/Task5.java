package Exercise1;
import java.util.Scanner;

public class Task5
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number (float): ");
		float input = scan.nextFloat();
		
		int input_int = (int)input;
		float input_decimal_point = input - input_int;
		
		System.out.printf("The number is: %.2f, its integer part is: %d and its fraction is: %f\n", input, input_int, input_decimal_point);
		scan.close();
	}

}
