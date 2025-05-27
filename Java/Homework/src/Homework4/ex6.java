package Homework4;

public class ex6
{

	public static boolean subsetSum(int[] arr, int sum)
	{
		if(arr.length < 2)
			return false;
		
		int first = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			int currentNumber = arr[i];
			if(first + currentNumber == sum)
				return true;
		}
		
		
		int newArr[] = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i++)
			newArr[i] = arr[i + 1];
		
		return subsetSum(newArr, sum);
	}
	
	public static void main(String[] args)
	{
		System.out.println(subsetSum(new int[] { 3, 8, 15, 97, 6 }, 9));
		System.out.println(subsetSum(new int[] { 4, 5, 87, 2, 12, 3 }, 13));
	}

}
