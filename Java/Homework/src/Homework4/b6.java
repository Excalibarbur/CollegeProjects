package Homework4;

import java.util.Arrays;

public class b6
{
	
	public static void swap(int[] arr, int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static int bubbleSortReverse(int[] arr)
	{
		int count = 0;
		
		for(int numOfBbl = 0; numOfBbl < arr.length - 1; numOfBbl++)
		{
			for(int bbl = 0; bbl < arr.length - 1 - numOfBbl; bbl++)
			{
				if(arr[bbl] < arr[bbl + 1])
				{
					swap(arr, bbl, bbl+1);
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr5 = {21, 4, 19, 7, 13, 25, 15, 10, 24};
        int[] arr6 = {24, 10, 15, 25, 13, 7, 19, 4, 21};
        int[] arr7 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr8 = {25, 24, 21, 19, 15, 13, 10, 7, 4};
        
        System.out.println("Amount of swaps for arr5: " + bubbleSortReverse(arr5)); // Expected: 21
        System.out.println("Sorted arr5: " + Arrays.toString(arr5));

        System.out.println("Amount of swaps for arr6: " + bubbleSortReverse(arr6)); // Expected: 15
        System.out.println("Sorted arr6: " + Arrays.toString(arr6));

        System.out.println("Amount of swaps for arr7: " + bubbleSortReverse(arr7)); // Expected: 36
        System.out.println("Sorted arr7: " + Arrays.toString(arr7));

        System.out.println("Amount of swaps for arr8: " + bubbleSortReverse(arr8)); // Expected: 0
        System.out.println("Sorted arr8: " + Arrays.toString(arr8));
	}

}
