package Exercise2;
import java.util.Scanner;

public class Task6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1 if member, 0 otherwise: ");
		int member = scan.nextInt();
		System.out.print("Enter purchase amount: ");
		int amount = scan.nextInt();
		
		float discount = 0;
		if(member == 1)
		{
			if(amount >= 100)
				discount = (float)(amount * 0.10);
			else
				discount = amount - 5;
		}
		else if(member == 0)
		{
			if(amount >= 200)
				discount = (float)(amount * 0.05);
		}
		
		System.out.printf("Discount amount: %.2f Shekels\n", discount);
		scan.close();
	}

}
