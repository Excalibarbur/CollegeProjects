package Homework3;
import java.util.Scanner;

public class ex7
{

	public static String[] TheFunc(String[] arr, String str)
	{
		// need a sorting mech
		/*
			"hello" = "h" "e" "l" "l" "o"
			
			like say but summer call world
		*/
		
		int size = 0;
		for(String word : arr)
		{
			if(word.compareToIgnoreCase(str) < 0)
				size++;
		}
		
		String[] res = new String[size];
		int index = 0;
		for(String word : arr)
		{
			if(word.compareToIgnoreCase(str) < 0)
			{
				res[index] = word;
				index++;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int arr_size = scan.nextInt();
		
		
		String words[] = new String[arr_size];
		int count = 0;
		
		System.out.print("Enter words: ");
		while(count < arr_size)
		{
			String input = scan.next();
			words[count] = input;
			count++;
		}
		
		scan.nextLine(); // Clean buffer
		
		
		System.out.print("Enter a string: ");
		String str = scan.next();

		String[] res_arr = TheFunc(words, str);
		String res = String.join(", ", res_arr);
		
		System.out.printf("The words which should appear before \"%s\" on the dictionary are: %s", str, res);
		
		scan.close();
	}

}
