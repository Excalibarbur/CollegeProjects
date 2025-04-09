package Exercise5;
import java.lang.Math;

public class Task1
{

	public static int diff21(int n)
	{
		int abs = Math.abs(21 - n);
		if(n > 21)
			return abs * 2;
		return abs;
	}
	
	public static void main(String[] args)
	{
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));
		System.out.println(diff21(25));
	}

}
