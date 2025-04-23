package Exercise6;

public class Task3
{

	public static int fn3(double x)
	{
		int floored = (int)x;
		int res = 0;
		
		if((double)floored == x)
			res = floored;
		else if(floored > 0)
			res = floored + 1;
		else if(floored < 0)
			res = floored - 1;
		
		return res;
	}
	
	public static void main(String[] args)
	{
		System.out.println(fn3(-12.00001));
	}

}
