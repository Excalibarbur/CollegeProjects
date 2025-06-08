package Homework4;

public class task3
{

	private static int jumpSearch(int[] arr, int k, int step, int index, int comparisons)
	{
        if (index >= arr.length || arr[index] > k)
        {
            int start = Math.max(0, index - step + 1);
            int end = Math.min(arr.length - 1, index);
            
            for (int i = start; i <= end; i++)
            {
                if (arr[i] == k || arr[i] > k)
                    return i;
                comparisons++;
            }
            
            //System.out.println("The amount of unsuccessful comparisons I've made is " + comparisons); // no need for that
            return -1;
        }

        if (arr[index] == k)
        {
            System.out.println("The amount of unsuccessful comparisons I've made is " + comparisons);
            return index;
        }

        return jumpSearch(arr, k, step, index + step, comparisons + 1);
    }
	
	public static int jumpSearch(int[] arr, int k, int step)
	{
		return jumpSearch(arr, k, step, 0, 0);
	}
	
	
	public static void main(String[] args)
	{
		int[] arr1 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr2 = {-15, -5, 3, 7, 15, 97, 100};
        int k1 = 15, k2 = 12;
        int stepSize = 3;

        System.out.println("Amount of elements smaller than 15: " + jumpSearch(arr1, k1, stepSize)); // Output: 6
        System.out.println("Amount of elements smaller than 12: " + jumpSearch(arr2, k2, stepSize)); // Output: 4
	}

}
