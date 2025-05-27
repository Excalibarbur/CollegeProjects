package Homework4;

public class ex1
{
	
	public static int findMax(int arr[])
	{
		int max = Integer.MIN_VALUE;
		if(arr.length != 1)
		{
			// Create new array, so it will be acted like a pop functions in other languages
			int newArr[] = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1; i++)
				newArr[i] = arr[i];
			
			// Recall the function until it will be 1 in length
			max = findMax(newArr);
		}
		
		// Most left integer in the current array
		int mostLeftDigit = arr[arr.length - 1];
		if(mostLeftDigit > max)
			max = mostLeftDigit; // Update the max variable
		
		return max;
	}

	public static void main(String[] args)
	{
		System.out.println(findMax(new int[] { 1, 2, 9, 3 }));
	}

}
