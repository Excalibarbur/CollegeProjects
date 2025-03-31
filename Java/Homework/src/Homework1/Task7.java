package Homework1;
import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		boolean valid_n = false;
		
		while(!valid_n)
		{
			System.out.print("Enter a positive integer n: ");
			n = scan.nextInt();
			
			if(n >= 1 && n <= 9)
				valid_n = true;
			else
				System.out.println("Error: Please enter a positive integer greater than 0 and less than 10.");
		}
		
		
		// Calculate the power of the start-point and the end-point
		int start_n = 1, end_n = 1;
		
		for(int i = 0; i < n; i++)
			start_n *= 10;
		
		for(int i = 0; i < (n + 1); i++)
			end_n *= 10;
		
		
		// ACTION !
		System.out.printf("Palindrome numbers between %d and %d: ", start_n, end_n - 1);
		for(int i = start_n; i <= end_n; i++)
		{
			// Creating a temporarily variable of "i" so we can edit it without changing its original content.
			int tmp_i = i;
			int reversed = 0;
			while(tmp_i != 0)
			{
				int digit = tmp_i % 10; 			// Getting the most right digit in tmp_i
				reversed = reversed * 10 + digit;	// Calculate the reverse of the current number
				tmp_i /= 10; 						// Cop' the most right digit in tmp_i
			}
			
			if(i == reversed)
			{
				System.out.print(i); //  !(i + 1 >= end_n) 
				if(i + 1 < end_n) // Aslong as the last number of looped-i (+1) less-than "end_n" - add comma (,)
					System.out.print(", ");
			}
		}
		
		scan.close();
	}

}
