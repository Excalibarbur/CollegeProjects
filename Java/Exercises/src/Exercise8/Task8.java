package Exercise8;

public class Task8
{
	
	public static boolean isExists(int arr[][], int col, int row, int target)
	{	
		int nextCol = col + 1;
		int nextRow = row;
		
		if(nextCol == arr[0].length)
		{
			nextCol = 0;
			nextRow = row + 1;
		}
		
		boolean res = false;
		
		if(nextRow != arr.length && nextCol != arr[0].length)
			res = isExists(arr, nextCol, nextRow, target);
		
		if(res == true)
			return true;
		
		if(arr[row][col] == target)
			res = true;
			
		return res;
	}

	public static void main(String[] args)
	{
		int[][] mat = {
				{ 10, 4, 6, 7 },
				{ 11, 3, 15, 1 }
		};
		
		System.out.println(isExists(mat, 0, 0, 7));
	}

}
