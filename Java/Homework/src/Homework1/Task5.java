package Homework1;
import java.util.Scanner;

public class Task5
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number representing the day of the week (1-7): ");
		int weekday_num = scan.nextInt();
		
		switch(weekday_num)
		{
			case 1:
			case 3:
			case 4:
			case 5:
				System.out.println("The call center is open from 10:00 to 13:00");
				if(weekday_num == 4)
					System.out.println("Additionally, the call center is open from 16:00 to 19:00");
				break;
				
			case 2:
				System.out.println("The call center is open from 09:00 to 14:00");
				break;
				
			case 6:
				System.out.println("The call center is open from 10:00 to 12:00");
				break;
				
			case 7:
				System.out.println("The call center is closed.");
				break;
				
			default:
				// They didn't told me anything about "Error" msg :/
		}
		
		scan.close();
	}

}
