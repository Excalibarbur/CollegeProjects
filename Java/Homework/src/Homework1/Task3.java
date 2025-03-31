package Homework1;
import java.util.Scanner;

/*
 * Conditions:
 * 	1. Must be over 0 (טבעיים)
 *  2. Sum of all variables MUST be 180
 *  
 * If Success - Print by the variables:
 *  1. Scalene triangle 	- שונה צלעות
 *  2. Isosceles triangle 	- שווה שוקיים
 *  3. Equilateral triangle - שווה צלעות
 *  	NOTE: כי משולש שווה צלעות הוא גם שווה שוקיים, אך במקרה זה נבחר בסוג שווה צלעות
 *  
 *  Scripted in nested-ifs because we haven't learned to use program-closing function.
*/

public class Task3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter lengths of three edges: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(x > 0 && y > 0 && z > 0)
		{
			Boolean sum_check = ((x + y) > z) && ((x + z) > y) && ((y + z) > x);
			if(sum_check)
			{
				if(x == y && x == z)
					System.out.println("Equilateral triangle");
				else if((x == y || x == z) || (y == x || y == z) || (z == x || z == y))
					System.out.println("Isosceles triangle");
				else
					System.out.println("Scalene triangle");
			}
			else 
				System.out.println("We cannot make a triangle from these edges.");
		}
		else
			System.out.println("Error");
		
		scan.close();
	}

}
