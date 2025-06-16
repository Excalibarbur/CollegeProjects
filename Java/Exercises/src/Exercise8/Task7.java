package Exercise8;

public class Task7
{

	public static int sumEvenX(int[][] arr, int row, int col)
	{
		int nextCol = col + 1;
		int nextRow = row;
		
		
		if(nextCol == arr[0].length)
		{
			nextCol = 0;
			nextRow += 1;
		}
		
		int count = 0;
		if(nextRow != arr.length && nextCol != arr[0].length)
			count += sumEvenX(arr, nextRow, nextCol);
		
		if(arr[row][col] % 2 == 0)
			count += arr[row][col];
		
		return count;
	}
	

	public static void main(String[] args)
	{
		int[][] mat = {
				{ 10, 4, 6, 7 },
				{ 11, 3, 15, 1 }
		};
		System.out.println(sumEvenX(mat, 0, 0));
	}

}
