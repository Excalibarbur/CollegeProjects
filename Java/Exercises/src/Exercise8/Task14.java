package Exercise8;

public class Task14
{

	public static int power(int n, int k)
	{
		int res = 1;
		
		if(k > 1)
			res = power(n, k - 1);
		
		//res = res * n;
		
		return res * n;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(power(3, 3));
	}

}
