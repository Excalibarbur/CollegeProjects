package Exercise5;
import java.lang.Math;

public class Task2
{
	
	public static double max(double x, double y, double z)
	{
		double max = x;
		
		if(y > max)
			max = y;
		
		if(z > max)
			max = z;
		
		return max;
	}
	
	public static double max2(double x, double y, double z)
	{
		double max = Math.max(x, y);
		max = Math.max(max, z);
		
		return max;
	}

	public static void main(String[] args)
	{
		System.out.println(max(5.0, 9.2, 4.1));
		System.out.println(max2(5.0, 9.2, 4.1));
	}

}
