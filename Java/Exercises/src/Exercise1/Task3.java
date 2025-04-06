package Exercise1;
import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 grades:");
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();
		
		float average = (float)(x1 + x2 + x3) / 3;
		System.out.println("Average: " + average);
		scan.close();
	}

}
