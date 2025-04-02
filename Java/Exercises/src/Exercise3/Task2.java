package Exercise3;
import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		while (true)
		{
			System.out.print("Enter a char: ");
			char x = scan.next().charAt(0);
			int x_ascii = (int)x;
			
			if(x_ascii < (int)('a') || x_ascii > (int)('z'))
				break;
			
			int x_delta_from_a = x_ascii - (int)'a';
			int capital_letter = (int)'A' + x_delta_from_a;
			char result_letter = (char)capital_letter;
			
			System.out.println(result_letter);
		}
		
		scan.close();
	}

}
