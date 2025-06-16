package Homework4;

public class b4
{

	public static int ternarySearch(int[] arr, int num, int D)
	{
		return -1;
	}
	
	public static int ternarySearch(int[] arr, int num)
	{
	    int left = 0;
	    int right = arr.length - 1;

	    while (left <= right)
	    {
	        int third = (right - left) / 3;
	        int mid1 = left + third;
	        int mid2 = right - third;

	        if (arr[mid1] == num)
	            return mid1;
	        
	        if (arr[mid2] == num)
	            return mid2;

	        if (num < arr[mid1]) 
	            right = mid1 - 1;

	        else if (num > arr[mid2]) 
	            left = mid2 + 1;
	        
	        else 
	        {
	            left = mid1 + 1;
	            right = mid2 - 1;
	        }
	    }
	    
	    return -1;
	}

	
	public static void main(String[] args)
	{
		int[] arr3 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr4 = {-15, -5, 3, 7, 15, 97};
        int num1 = 15;
        int num2 = 12;

        System.out.println(ternarySearch(arr3, num1)); // Output: 6
        System.out.println(ternarySearch(arr4, num2)); // Output: -1
	}

}
