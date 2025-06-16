package Homework4;
import java.lang.Math;

public class a5
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
		int n1 = 2, m1 = 8;
        System.out.println("Is " + m1 + " a power of " + n1 + "? " + isPower(n1, m1)); // Is 8 a power of 2? true

        int n2 = 3, m2 = 6;
        System.out.println("Is " + m2 + " a power of " + n2 + "? " + isPower(n2, m2)); // Is 6 a power of 3? false
	}

}
