package Homework4;

public class ex1
{
	
	public static int findMax(int arr[], int index, int lastMax)
	{
		if(index == arr.length)
			return lastMax;
		
		if(arr[index] > lastMax)
			lastMax = arr[index];
		
		return findMax(arr, index + 1, lastMax);
	}

	public static int findMax(int arr[])
	{
		return findMax(arr, 0, arr[0]);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(findMax(new int[] { 1, 2, 9, 3 }));
	}

}
