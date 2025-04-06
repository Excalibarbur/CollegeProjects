package Exercise3;
import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int totalGrade = 0;
		int count = 0;
		while(true)
		{
			System.out.print("Enter a grade: ");
			int input = scan.nextInt();
			
			if(input == -1)
				break;
			
			if(input < 0 || input > 100)
			{
				System.out.println("Invalid grade ! (Valid grades are between 0-100)");
				continue;
			}
			
			totalGrade += input;
			count++;
		}
		
		int average = totalGrade / count;
//		System.out.println(average);
		if(average < 56)
			System.out.println("Failed.");
		else
			System.out.println("Qualified.");
		
		scan.close();
	}

}
