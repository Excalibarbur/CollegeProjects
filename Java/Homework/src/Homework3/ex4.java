package Homework3;
import java.util.Scanner;

public class ex4
{

	public static void printMatrix(int[][] matrix)
	{
		for(int[] row : matrix)
		{
			for(int i = 0; i < row.length; i++)
			{
				String res;		
				switch(row[i])
				{
				case 1:
					res = "x";
					break;
				case 2:
					res = "o";
					break;
				default:
					res = "_";
				}
				System.out.printf("%s%s", res, ((i == row.length - 1) ? "\n" : " "));
			}
		}
	}
	
	public static int whoWon(int[][] matrix)
	{
		/*
		
		x x x
		x _ _
		x _ _
		
		*/
		
		for (int[] row : matrix)
		{
			if(row[0] == 1 && row[1] == 1 && row[2] == 1)
				return 1;
			else if(row[0] == 2 && row[1] == 2 && row[2] == 2)
				return 2;
		}
		
		for(int col = 0; col < matrix.length; col++)
		{
			if(matrix[0][col] == 1 && matrix[1][col] == 1 && matrix[2][col] == 1)
				return 1;
			else if(matrix[0][col] == 2 && matrix[1][col] == 2 && matrix[2][col] == 2)
				return 2;
		}
		
		
		/*
		
		x _ _
		_ x _
		_ _ x
		
		*/
		
		if(matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1)
			return 1;
		else if(matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2)
			return 2;
		
		
		
		/*
		
		_ _ x
		_ x _
		x _ _
		
		*/

		if(matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1)
			return 1;
		else if(matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2)
			return 2;
		
		
		// If no one did
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int matrix[][] = new int[3][3];
		
		int moves = 0;
		final int MAX_MOVES = 3 * 3;
		int currentPlayer = 1;
		
		System.out.println("The table result:");
		printMatrix(matrix);
		
		while(moves < MAX_MOVES)
		{
			System.out.printf("\nEnter row and column for player %s: ", (currentPlayer == 1 ? 'x' : 'o'));
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			
			if(row > 3 || row < 1 || col > 3 || col < 1)
			{
				System.out.println("[ERROR] The current selection is out-of-bounds ! Please try again.");
				continue;
			}
			
			if(matrix[row-1][col-1] != 0)
			{
				System.out.println("[ERROR] The current selection is already marked ! Please try again.");
				continue;
			}
			
			
			// Commit mark
			matrix[row-1][col-1] = currentPlayer;
			
			
			// Increase move-count
			moves++;
			
			
			// Print Matrix
			System.out.println("The table result:");
			printMatrix(matrix);
			
			
			// Need to check here if won
			int winner = whoWon(matrix);
			if(winner != 0)
			{
				System.out.printf("The winner is %s !!!!\n", (winner == 1 ? 'x' : 'o'));
				break;
			}
			
			// Check if tie
			if(moves == MAX_MOVES)
				System.out.println("Tie !");
			
			// Switch Players
			if(currentPlayer == 1)
				currentPlayer = 2;
			else currentPlayer = 1;	
		}
//		System.out.println("[END]"); // End of game
		
		scan.close();
		
	}

}
