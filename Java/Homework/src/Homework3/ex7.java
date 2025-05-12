package Homework3;
import java.util.Scanner;

public class ex7
{

	public static String[] findPrevInDict(String[] arr, String str)
	{
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
		System.out.print("Enter words: ");
		for(int i = 0; i < arr_size; i++)
		{
			String input = scan.next();
			words[i] = input;
		}
		
		
		scan.nextLine(); // Clean buffer
		
		
		System.out.print("Enter a string: ");
		String str = scan.next();

		String[] result_arr = findPrevInDict(words, str);
		String result = String.join(", ", result_arr);
		
		System.out.printf("The words which should appear before \"%s\" on the dictionary are: %s", str, result);
		
		scan.close();
	}

}
