package Homework2;
import java.util.Scanner;

public class Tasks
{
	// [ Pre-defined useful-functions ]:
	// Since we cannot use any libraries except Scanner, we will build some useful functions here:
	
	// Defined a function for Powering a number 
	public static int power(int num, int times)
	{
		// X^0 == 1 
		if(times == 0)
			return 1;
		
		int result = num;
		for(int i = 0; i < (times - 1); i++)
			result *= num;
		
		return result;
	}
	
	// Defined a function to count the digits in a number (int data type)
	public static int countDigitsInNum(int num)
	{
		int count = 0;
		while(num != 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
	
	// Defined a function to calculate the GCD out of two numbers
	public static int GCD(int num1, int num2)
	{
		while(num2 != 0)				// While num2 is isn't 0: (end of GCD)
		{
			int tmp = num2;				// Saved value of num2 before variable-redefinition
			num2 = num1 % num2;			// The new num2 value its the Modulu of num1%num2
			num1 = tmp;					// Update variable num1 to be the saved number of num2 (restore)
		}
		
		return num1;
	}
	
	// -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
	// [ Main handle and run ]:
	
	public static void main(String[] args)
	{
		showMainMenu();
	}
	
	public static void showMainMenu()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menu:\nPlease choose an option:");
		System.out.println("1 - Convert Octal to Decimal");
		System.out.println("2 - Simplify fraction");
		System.out.println("3 - Print tomorrows date");
		System.out.println("4 - Print shape");
		System.out.println("5 - Print the pentagonal numbers");
		System.out.println("6 - Calculate the shape area");
		System.out.println("7 - Sets Of Letters");
		System.out.println("8 - Exit");
		
		int chosen = scan.nextInt();
		switch(chosen)
		{
		case 1:
			System.out.println("Enter a octal number:");
			int in1 = scan.nextInt();
			int out1 = octalToDecimal(in1);
			System.out.printf("The octal number %d is equal to %d in decimal.\n", in1, out1);
			break;
		case 2:
			simplifyFraction();
			break;
		case 3:
			System.out.println("Enter today's date (day/month/year):");
			int day = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
			tomorrowsDate(day, month, year);
			break;
		case 4:
			System.out.println("Enter n:");
			int n = scan.nextInt();
			System.out.println("Enter m:");
			int m = scan.nextInt();
			printShape(n, m);
			break;
		case 5:
			System.out.print("Enter the number of pentagonal numbers to print: ");
			int howMuch = scan.nextInt();
			printPentagonalNumbers(howMuch);
			break;
		case 6:
			calcArea();
			break;
		case 7:
			System.out.print("Enter 1st char: ");
			char char1 = scan.next().charAt(0);
			System.out.print("Enter 2st char: ");
			char char2 = scan.next().charAt(0);
			setsOfLetters(char1, char2);
			break;
		case 8:
			System.out.println("Exiting.");
			// I could place here return but the program would end either way
			break;
		}
		
		scan.close();
	}
	
	// -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
	// [ All the asked functions ]:
	
	public static int octalToDecimal(int octal) // octal == 8 bits == 1 byte == ???
	{
		int res = 0;
		int numCount = countDigitsInNum(octal);
		
		for(int i = 0; i < numCount; i++)
		{
			int digit = octal % 10;
			int pow = power(8, i) * digit;
			res += pow;
			octal /= 10;
		}
		
		return res;
	}

	public static void simplifyFraction()
	{
		Scanner scan = new Scanner(System.in);
		int numerator, denominator;
		
		System.out.println("Enter a fraction you want to simplify:");
		System.out.print("Enter the numerator: ");
		numerator = scan.nextInt();
		
		while(true)
		{
			System.out.print("Enter the denominator: ");
			denominator = scan.nextInt();
			
			if(denominator == 0)
				System.out.println("[Error] The denominator cannot be 0.");
			else
				break;
		}
		
		int theGCD = GCD(numerator, denominator);
		int newNumerator = numerator / theGCD;
		int newDenominator = denominator / theGCD;
	
		System.out.printf("The fraction you entered is: %d/%d\n", numerator, denominator);
		System.out.printf("Its simplest from is: %d/%d\n", newNumerator, newDenominator);
		scan.close();
	}
	
	public static void tomorrowsDate(int day, int month, int year)
	{
		boolean shana_Meuberet = false;
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			shana_Meuberet = true;
		
		switch(month)
		{
		case 1, 3, 5, 7, 8, 10, 12:
			if(day == 31)
			{
				day = 1;
				if(month == 12)
				{
					month = 1;
					year++;
				}
				else month++;
			}
			else day++;
			break;
			
		case 4, 6, 9, 11:
			if(day == 30)
			{
				day = 1;
				month++;
			}
			else day++;
			break;
			
		case 2:
			if((shana_Meuberet && day == 29) || (!shana_Meuberet && day == 28))
			{
				day = 1;
				month++;
			} 
			else day++;
			break;
		}
		
		System.out.printf("Tomorrow's date: %02d/%02d/%04d\n", day, month, year);
	}
	
	public static void printShape(int n, int m)
	{
		if(n == 1)
		{
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < m; j++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		else if (n == 2)
		{
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < (m * 2); j++)
				{
					if(i == 0 || i == (m - 1))
						System.out.print("* ");
					else
					{
						if(j == 0 || j == ((m * 2) - 1))
							System.out.print("* ");
						else System.out.print("  ");
					}
				}
				
				System.out.println("");				
			}
		}
		else
		{
			int startEndPoint = m;
			if(m > 3)
				startEndPoint = (5 + 2 * (m - 4));

			final int maxPoint = startEndPoint;
			boolean flip = false;
			
			for(int i = 0; i < (m * 2 - 1); i++)
			{
				int spaces = maxPoint - startEndPoint;
				for(int j = 0; j < spaces; j++)
					System.out.print(" ");
				
				for(int j = 0; j < startEndPoint; j++)
					System.out.print("* ");
				System.out.print("\n");
				
				if(startEndPoint == 1)
					flip = true;
				
				if(!flip)
				{
					if(startEndPoint > 3)
						startEndPoint -= 2;
					else startEndPoint--;
				}
				else
				{
					if((startEndPoint + 1) > 3)
						startEndPoint += 2;
					else startEndPoint++;
				}
			}
		}
	}
	
	public static void printPentagonalNumbers(int n)
	{
		System.out.printf("The first %d pentagonal numbers are: \n", n);
		for(int i = 1; i <= n; i++)
		{
			int pentagonal = (3 * power(i, 2) - i) / 2;
			System.out.printf("%d%s", pentagonal, (i == n) ? "\n" : ", ");
		}
	}
	
	public static void calcArea()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculate Shape Area");
		
		System.out.println("Enter the num of shape whose area you want to find:");
		System.out.println("Enter 1 for triangle, 2 for circle, 3 for square and 4 for rectangle");
		int choose = scan.nextInt();
		
		switch(choose)
		{
		case 1:
			System.out.println("Enter triangle's height length:");
			int triangle_height = scan.nextInt();
			System.out.println("Enter triangle's breadth length:");
			int triangle_base = scan.nextInt();
			System.out.printf("The area is: %d\n", (triangle_base * triangle_height / 2));
			break;
		case 2:
			System.out.println("Enter circle's radius length:");
			int circle_radius = scan.nextInt();
			System.out.printf("The area is: %.1f\n", (3.14 * power(circle_radius, 2)));
			break;
		case 3:
			System.out.println("Enter square's side length:");
			int square_length = scan.nextInt();
			System.out.printf("The area is: %d\n", power(square_length, 2));
			break;
		case 4:
			System.out.println("Enter rectangle's length:");
			int rectangle_length = scan.nextInt();
			System.out.println("Enter rectangle's breadth:");
			int rectangle_base = scan.nextInt();
			System.out.printf("The area is: %d\n", (rectangle_length * rectangle_base));
		break;
		}
		
		scan.close();
	}
	
	public static void setsOfLetters(char x, char y)
	{
		int min = (int)'a';
		int max = (int)'z';
		
		if((int)x < min || (int)x > max || (int)y < min || (int)y > max)
		{
			System.out.println("[Error] Both parameters should be lowercase.");
			return;
		}
		
		// discover who's the bigger in "int" size
		int start = 0, end = 0;
		
		if((int)x > (int)y)
		{
			start = (int)y;
			end = (int)x;
		}
		else
		{
			start = (int)x;
			end = (int)y;
		}
		
		// Calculate range for number of lines we're about to print
		int lines = end - start;
		
		// Loop time the lines
		for(int i = 0; i <= lines; i++)
		{
			// For each character between x and y:
			for(int j = start; j <= end; j++)
			{
				// Print the set
				System.out.printf("(%c, %c)", (char)start, (char)j);
				
				// Add comma or space, depends on the index
				System.out.printf("%s", j == end ? "\n" : ", ");
			}
			
			// Increase the minimal char-value by 1
			start++;
		}
	}
	
}
