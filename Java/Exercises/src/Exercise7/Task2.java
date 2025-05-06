package Exercise7;

public class Task2
{
	
	public static int[] fibonacci(int n)
	{
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			if(i == 0 || i == 1)
				arr[i] = 1;
			else
				arr[i] = arr[i-1] + arr[i-2];
		}
			
		return arr;
	}

	public static void main(String[] args)
	{
		for(int each : fibonacci(7))
			System.out.println(each);
	}

}
