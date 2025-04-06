package Exercise3;
import java.util.Scanner;

public class Task4
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the start of the range: ");
		int start = scan.nextInt();
		System.out.print("Enter the end of the range: ");
		int end = scan.nextInt();
	
		System.out.printf("Prime numbers in the range %d to %d: ", start, end);
		for(int i = start; i <= end; i++)
		{
			boolean hasDivision = false;
			
			for(int j = i; j != 0; j--)
			{
				if(i % j == 0 && j != 1 && j != i)
				{
					hasDivision = true;
					break;
				}
			}
			if(!hasDivision)
				System.out.print(i + " ");
		}
		
		scan.close();
	}

}
