package Homework3;
import java.util.Scanner;

public class ex8
{
	
	public static int TheFunc(String input)
	{
		final int ALPHABET_LEN = 26;
		int res = 0;
		
		
		String str_arr[] = input.split("");
		for(int i = 0; i < str_arr.length; i++)
		{
			int ascii = str_arr[i].charAt(0);

			if(ascii < (int)'A' || ascii > (int)'Z')
		    	continue;

			int charNum = (ascii - (int)'A' + 1);
			
			if(i == str_arr.length - 1)
				res += charNum;
			else res += (ALPHABET_LEN * charNum);
			
		}
		
		return res;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = scan.nextLine();

		int res = TheFunc(str);
		System.out.printf("%s -> %s\n", str, res);
		
		scan.close();
	}

}
