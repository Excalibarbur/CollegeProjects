package Homework4;

public class ex6
{

	public static boolean subsetSum(int[] arr, int sum, int index, int index2)
	{
		if(index >= arr.length)
			return false;
		
		if(arr[index] + arr[index2] == sum)
			return true;
		
		if(index2 + 1 >= arr.length)
			return subsetSum(arr, sum, index + 1, 0);
		return subsetSum(arr, sum, index, index2 + 1);
	}
	
	public static boolean subsetSum(int[] arr, int sum)
	{
		return subsetSum(arr, sum, 0, 1);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(subsetSum(new int[] { 3, 8, 15, 97, 6 }, 9));
		System.out.println(subsetSum(new int[] { 4, 5, 87, 2, 12, 3 }, 13));
	}

}
