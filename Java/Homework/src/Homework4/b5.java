package Homework4;

import java.util.Arrays;

public class b5
{
	public static int insertionSort(int[] arr)
	{
		int count = 0;
		for(int i = 1; i < arr.length; i = i + 1)
		{
			int value = arr[i];
			
			int j;
			for(j = i; j > 0 && arr[j - 1] < value; j--)
			{
				arr[j] = arr[j - 1];
				count++;
			}
			
			arr[j] = value;
		}
		
		return count;
	}

	
	public static void main(String[] args)
	{
		int[] arr5 = {21, 4, 19, 7, 13, 25, 15, 10, 24};
        int[] arr6 = {24, 10, 15, 25, 13, 7, 19, 4, 21};
        int[] arr7 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr8 = {25, 24, 21, 19, 15, 13, 10, 7, 4};
        
        System.out.println("Amount of moves for arr5: " + insertionSort(arr5)); // Expected: 21
        System.out.println("Sorted arr5: " + Arrays.toString(arr5));

        System.out.println("Amount of moves for arr6: " + insertionSort(arr6)); // Expected: 15
        System.out.println("Sorted arr6: " + Arrays.toString(arr6));

        System.out.println("Amount of moves for arr7: " + insertionSort(arr7)); // Expected: 36
        System.out.println("Sorted arr7: " + Arrays.toString(arr7));

        System.out.println("Amount of moves for arr8: " + insertionSort(arr8)); // Expected: 0
        System.out.println("Sorted arr8: " + Arrays.toString(arr8));
	}

}
