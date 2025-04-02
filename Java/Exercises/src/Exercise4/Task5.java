package Exercise4;

// The question seems recursive from the start

public class Task5
{
	
	public static int fibonacci(int n)
	{
		if(n == 1)
			return 1;
		else if (n == 0)
			return 0;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args)
	{
		int result = fibonacci(8);
		System.out.println(result);
	}

}
