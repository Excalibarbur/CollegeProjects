package Exercise3;
import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("Enter a number [%d]: ", i);
			int x = scan.nextInt();
			if(x / 10 >= 1)
				count++;
		}
		
		System.out.println("Total numbers above-or-equal to 2 digit: " + count);
		
		scan.close();
	}

}
