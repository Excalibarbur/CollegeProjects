package Exercise8;

public class Task5
{
	
	public static int addOddAndOddX(int[] arr, int index)
	{
		int count = 0;
		
		if((index % 2 != 0) && (arr[index] % 2 != 0))
			count += arr[index];
		
		if(index == arr.length - 1)
			return count;
		
		return count + addOddAndOddX(arr, index + 1);
	}
	

	public static void main(String[] args)
	{
		int[] arr = { 91, 1, 17, 21, 45, 44, 12 };
		System.out.println(addOddAndOddX(arr, 0));
	}

}
