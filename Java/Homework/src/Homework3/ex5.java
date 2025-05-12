package Homework3;
import java.util.Scanner;

public class ex5
{

	public static int[] scanString(String input)
	{
		int asciiBank[] = new int[4];
		
		for(int i = 0; i < input.length(); i++)
		{
			int ascii = (int)input.charAt(i);
			
			if(ascii >= 'A' && ascii <= 'Z')
				asciiBank[0]++;
			else if(ascii >= 'a' && ascii <= 'z')
				asciiBank[1]++;
			else if(ascii >= '0' && ascii <= '9')
				asciiBank[2]++;
			else asciiBank[3]++;
		}
		
		return asciiBank;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		
		int[] result = scanString(input);
		System.out.println("Upper case letters: " + result[0]);
		System.out.println("Lower case letters: " + result[1]);
		System.out.println("Numbers: " + result[2]);
		System.out.println("Special Characters: " + result[3]);
		
		scan.close();
	}
	

}
