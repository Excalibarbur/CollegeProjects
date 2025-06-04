package Homework4;

public class ex7
{

	public static int tribonacciElement(int n)
	{
		if(n == 0 || n == 1)
			return 0;
		
		if(n == 2)
			return 1;
		
		return tribonacciElement(n - 1) + tribonacciElement(n - 2) + tribonacciElement(n - 3);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(tribonacciElement(10));
	}

}
