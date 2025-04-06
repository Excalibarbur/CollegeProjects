package Exercise1;
import java.util.Scanner;

public class Bonus6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x-coordinates of the point M");
		float a = scan.nextFloat();
		System.out.println("Enter y-coordinates of the point M");
		float b = scan.nextFloat();
		
		System.out.println("Enter x-coordinates of the point A");
		float x = scan.nextFloat();
		System.out.println("Enter y-coordinates of the point A");
		float y = scan.nextFloat();
		
		float radiusSquared = (x - a)*(x - a) + (y - b)*(y - b);
		System.out.printf("(x - %f)^2 + (y - %f)^2 = %f\n", a, b, radiusSquared);
		
		scan.close();
	}

}
