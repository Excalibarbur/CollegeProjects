package Exercise2;
import java.util.Scanner;

public class Task4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of the drink you want: ");
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("You chose Coffee. The price is $2.50.");
			break;
		case 2:
			System.out.println("You chose Tea. The price is $1.75.");
			break;
		case 3:
			System.out.println("You chose Soda. The price is $1.50.");
			break;
		case 4:
			System.out.println("You chose Water. The price is $1.00.");
			break;
		case 5:
			System.out.println("You chose Juice. The price is $2.00.");
			break;
		default:
			System.out.println("Invalid choice.");
		}
		
		scan.close();
	}

}
