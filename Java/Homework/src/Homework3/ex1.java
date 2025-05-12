package Homework3;
import java.util.Scanner;

public class ex1
{

	public static int[] flip(int[] arr, int index1, int index2)
	{
		if(index1 < 0 || index2 < 0 || index1 > arr.length || index2 > arr.length)
			return arr;
		
		// SAVE arr[INDEX_1]
		int tmp1 = arr[index1];
		
		// SET arr[INDEX_1] to arr[INDEX_2]
		arr[index1] = arr[index2];
		
		// arr[INDEX_1] to SAVED arr[INDEX_1]
		arr[index2] = tmp1;
		
		return arr;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 10 integers (0 is not allowed): ");
		
		int input_arr[] = new int[10];
		int count = 0;
		while(count != 10)
		{
			int input = scan.nextInt();
			if(input == 0)
				continue;
			
			input_arr[count] = input;
			count++;
		}
		
		for(int i = 0; i <= 4; i++)
		{
			int x = i * 2;
			int y = i * 2 + 1;
			
			if(input_arr[x] % input_arr[y] == 0)
				input_arr = flip(input_arr, x, y);
		}
		
		System.out.print("Result array ");
		for(int each : input_arr)
			System.out.print(each + " ");
		
		
		scan.close();
	}

}
