package Exercise8;

public class Task12
{
	
	public static int findGreater(double[] arr, int n, int index)
	{
		int count = 0;
		if(index < arr.length - 1)
			count += findGreater(arr, n, index + 1);
		
		if(arr[index] > (float)n)
			count++;
		
		return count;
	}
	
	public static int findGreater(double[] arr, int n)
	{
		return findGreater(arr, n, 0);
	}
	
	
	public static void main(String[] args)
	{
		double[] arr = { 1.321, 4.2, 5.3 };
		System.out.println(findGreater(arr, 2));
	}

}
