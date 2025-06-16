package Exercise8;

public class Task15
{

	public static int maxDevidedBy3(int[] arr, int index)
	{
		int max = Integer.MIN_VALUE;
		
		if(index < arr.length - 1)
			max = maxDevidedBy3(arr, index + 1);
		
		if(arr[index] % 3 == 0 && arr[index] > max)
			max = arr[index];
		
		if(max == Integer.MIN_VALUE && index == 0)
			max = 0;
		
		return max;
	}
	
	public static int maxDevidedBy3(int[] arr)
	{
		return maxDevidedBy3(arr, 0);
	}
	
	
	public static void main(String[] args)
	{
		//int[] arr = { 3, 9, 27, 81, 12, 88 };
		int[] arr = { 2, 4 };
		System.out.println(maxDevidedBy3(arr));
	}

}
