package Homework4;

public class ex5
{
	
	public static boolean isPower(int n, int m)
	{
		if(m == 1)
			return true;
		
//		if(n <= 1)
//			return false;
		if (m % n != 0)
			return false;
		
		return isPower(n, m / n);
	}

	public static void main(String[] args)
	{
		System.out.println(isPower(2, 8));
		System.out.println(isPower(3, 6));
	}

}
