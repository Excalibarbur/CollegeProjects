package Exercise1;
import java.util.Scanner;

public class Bonus7
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		float xm, ym;
		
		System.out.println("Enter x-coordinates of the point a");
		x1 = scan.nextInt();
		System.out.println("Enter y-coordinates of the point a");
		y1 = scan.nextInt();
		
		System.out.println("Enter x-coordinates of the point b");
		x2 = scan.nextInt();
		System.out.println("Enter y-coordinates of the point b");
		y2 = scan.nextInt();
		
		xm = (float)(x1 + x2) / 2;
		ym = (float)(y1 + y2) / 2;
		
		System.out.printf("M (%.1f, %.1f)\n", xm, ym);
		
		scan.close();
	}

}
