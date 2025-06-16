package Exercise8;

public class Task6
{
	
	public static int minGreaterThan10(int[] arr, int index)
	{
		int min = Integer.MAX_VALUE;
		
		if(index < arr.length - 1)
			min = minGreaterThan10(arr, index + 1);
		
		int num = arr[index];
		if(num > 10 && num < min)
			min = num;
		
		
		if(min == Integer.MAX_VALUE && index == 0)
			return 10;
		
		return min;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = { 11, 3, 15, 1 };
		System.out.println(minGreaterThan10(arr, 0));
	}

}
