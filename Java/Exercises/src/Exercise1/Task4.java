package Exercise1;
import java.util.Scanner;

public class Task4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.printf("The number is %d, %d/2=%d, %d%%2=%d\n", num, num, (num / 2), num, (num % 2));
		scan.close();
	}

}
