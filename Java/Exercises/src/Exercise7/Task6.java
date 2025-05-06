package Exercise7;

public class Task6
{

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
	
	public static void main(String[] args)
	{
		//int arr_2d[][] = {  {1,3,2}, {4,9,2}, {7,3,5}, {3,5,1} };
		int[][] matrix = {
			    {3, 2, 3, 9, 6},
			    {1, 4, 6, 4, 5},
			    {3, 7, 9, 2, 7},
			    {9, 10, 5, 10, 9},
			    {10, 4, 2, 5, 4}
			};
		
		int[] res = getRowsSum(matrix);
		
		for(int each: res)
			System.out.println(each);
	}

}
