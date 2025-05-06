package Exercise7;

public class Task5
{
	
	public static int findMax(int arr[])
	{
		int max = arr[0];
		
		for(int curr : arr)
		{
			if(curr > max)
				max = curr;
		}
		
		return max;
	}

	public static void main(String[] args)
	{
		int test_arr[] = { 0, 11, 444, -90, 3, 8, 5, 6, 7, 8, 90 };
		
		System.out.println(findMax(test_arr));
	}

}
