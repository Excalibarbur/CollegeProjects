package Exercise7;

public class Task7
{
	public static int findMax(int arr[])
	{
		int max = arr[0];
		
		for(int curr : arr)
		{
			if(curr > max)
				max = curr;
		}
		
		return max;
	}
	
	public static int[] getRowsSum(int arr[][])
	{
		int res_arr[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
			res_arr[i] = sum;
		}
		
		return res_arr;
	}

	public static int getMaxRowSum(int arr[][])
	{
		int[] rowsSum = getRowsSum(arr);
		int max = findMax(rowsSum);
		return max;
	}
	
	
	public static void main(String[] args)
	{
		int[][] matrix = {
			    {3, 2, 3, 9, 6},
			    {1, 4, 6, 4, 5},
			    {3, 7, 9, 2, 7},
			    {9, 10, 5, 10, 9},
			    {10, 4, 2, 5, 4}
			};
		
		System.out.println(getMaxRowSum(matrix));
	}

}
