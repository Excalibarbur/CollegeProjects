package Exercise2;
import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19))
			System.out.println("There is a teenager.");
		else
			System.out.println("There are no teenagers.");
		
		scan.close();
	}

}
