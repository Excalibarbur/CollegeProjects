package Homework4;
import java.lang.Math;

public class ex5
{
	
	public static boolean isPower(int n, int m, int i)
	{
		int thePower = (int)Math.pow(n, i);
		
		if(thePower == m)
			return true;
		
		if(thePower > m)
			return false;
		
		return isPower(n, m, i+1);
	}
	
	public static boolean isPower(int n, int m)
	{
		return isPower(n, m, 0);
	}
	

	public static void main(String[] args)
	{
		System.out.println(isPower(2, 8));
		System.out.println(isPower(3, 6));
	}

}
