package Homework4;

import java.util.Arrays;

public class task7
{

	public static void swap(char[] arr, int i, int j)
	{
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static int bubbleSort(char[] arr, int n, int i)
	{
		if (n <= 1)
			return 0;

		if (i >= n - 1)
			return bubbleSort(arr, n - 1, 0); // סוף מעבר → ירידה בשכבה

		int count = 0;
		if (arr[i] > arr[i + 1])
		{
			swap(arr, i, i + 1);
			count = 1;
		}

		return count + bubbleSort(arr, n, i + 1); // המשך מעבר
	}
	
	public static int bubbleSort(char[] arr)
	{
		return bubbleSort(arr, arr.length, 0);
	}
	
	public static void main(String[] args)
	{
		char[] arr9 = {'u', 'd', 's', 'g', 'm', 'y', 'o', 'j', 'x'};
        char[] arr10 = {'Y', 'K', 'P', 'Z', 'N', 'H', 'T', 'E', 'V'};
        char[] arr11 = {'y', 'x', 'u', 's', 'o', 'm', 'j', 'g', 'd'};
        
        System.out.println("Amount of swaps for arr9: " + bubbleSort(arr9)); // Expected: 15
        System.out.println("Sorted arr9: " + Arrays.toString(arr9));

        System.out.println("Amount of swaps for arr10: " + bubbleSort(arr10)); // Expected: 21
        System.out.println("Sorted arr10: " + Arrays.toString(arr10));

        System.out.println("Amount of swaps for arr11: " + bubbleSort(arr11)); // Expected: 36
        System.out.println("Sorted arr11: " + Arrays.toString(arr11));
	}

}
