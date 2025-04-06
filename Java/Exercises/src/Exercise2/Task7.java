package Exercise2;
import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first grade: ");
		int first = scan.nextInt();
		System.out.print("Enter the second grade: ");
		int second = scan.nextInt();
		System.out.print("Enter the third grade: ");
		int third = scan.nextInt();
		System.out.print("Enter the forth grade: ");
		int forth = scan.nextInt();
		
		if(first >= 56 && second >= 56 && third >= 56 && forth >= 56)
			System.out.println("Pass");
		else System.out.println("Fail");
		
		float average = (float)(first + second + third + forth) / 4;
		System.out.printf("Average = %.2f\n", average);
		scan.close();
	}

}
