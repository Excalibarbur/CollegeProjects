package Exercise1;
import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter (int, float, double, char):");
		int x1 = scan.nextInt();
		float x2 = scan.nextFloat();
		double x3 = scan.nextDouble();
		int x4 = scan.next().charAt(0);
		
		System.out.printf("%d\n%f\n%f\n%c\n", x1, x2, x3, x4);
		scan.close();
	}

}
