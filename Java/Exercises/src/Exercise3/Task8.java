package Exercise3;
import java.util.Scanner;

public class Task8
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		while(input < 1)
		{
			System.out.print("Enter a number greater than 0: ");
			input = scan.nextInt();
		}
		
		for(int i = 0; i <= input; i++)
		{
			int times = input - i;
			for(int j = 0; j < times; j++)
				System.out.print(input - j + " ");
			System.out.println("");
		}
		
		scan.close();
	}

}
