package Exercise7;

public class Task3
{

	public static void func(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int num1 = 0, num2 = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				int product = arr[i] * arr[j];
				if(product > max)
				{
					max = product;
					num1 = arr[i];
					num2 = arr[j];
				}
			}
		}
		
		System.out.printf("%d and %d are the numbers with the highest product", num1, num2);
	}
	
	public static void main(String[] args)
	{
		int test_arr[] = { 0, 11, -90, 3, 8, 5, 6, 7, 8, 90 };
		func(test_arr);
	}

}
