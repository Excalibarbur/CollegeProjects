package Homework4;

public class a1
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
		int[] arr = {3, 32, 12, 4, 8};
        System.out.println("Max value in array: " + findMax(arr)); // Max value in array: 32
	}

}
