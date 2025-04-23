package Exercise6;
import java.util.Scanner;

public class Task1
{
	
	public static int factorial(int x)
	{
		if(x <= 1)
			return 1;
		
		int total = x;
/*		
		x--;
		while(x != 0)
		{
			total = total * x;
			x--;
		}
*/
		for(int i = (x - 1); i != 0; i--)
			total = total * i;
		
		return total;
	}
	
	public static int binomialCoefficient(int n, int k)
	{
		if(k < 0 && k > n)
			return 0;
//		if((k >= 0 && k <= n) && (n >= 0 && n < k))
			return (factorial(n) / (factorial(k) * factorial(n - k)));
//		
//		return 0;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n, k;
		
		System.out.print("Enter a number (n): ");
		n = scan.nextInt();
		while(n <= 0)// || n >= k)
		{
			System.out.printf("[Error] Value must be above 0 !\nEnter a number (n): ");
			n = scan.nextInt();
		}
		
		System.out.print("Enter a number (k): ");
		k = scan.nextInt();
		while(k <= 0)
		{
			System.out.print("[Error] Value must be above 0 !\nEnter a number (k): ");
			k = scan.nextInt();
		}
		
		System.out.printf("binomialCoefficient: (%d, %d) -> %d\n", n, k, binomialCoefficient(n, k));
		
		scan.close();
	}

}
