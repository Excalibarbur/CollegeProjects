package Homework4;

public class a6
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
		int[] arr1 = {3, 8, 15, 97, 6};
        int sum1 = 9;
        System.out.println("Subset with sum " + sum1 + " exists: " + subsetSum(arr1, sum1)); // Subset with sum 9 exists: true

        int[] arr2 = {4, 5, 87, 2, 12, 3};
        int sum2 = 13;
        System.out.println("Subset with sum " + sum2 + " exists: " + subsetSum(arr2, sum2)); // Subset with sum 13 exists: false
	}

}
