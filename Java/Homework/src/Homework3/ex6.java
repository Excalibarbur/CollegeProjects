package Homework3;
import java.util.Scanner;

public class ex6
{
	
	public static int countWords(String[] arr_str, String Sentence)
	{
		if(arr_str.length < 1)
			return 0;
		
		int count = 0;
		for(String word : arr_str)
		{
			if(Sentence.contains(word))
				count++;
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int arr_size = scan.nextInt();
		
		
		System.out.println("Enter words:");
		int count = 0;
		String[] str_arr = new String[arr_size];
		
		while(count < arr_size)
		{
			String input = scan.next();
			str_arr[count] = input;
			count++;
		}
		
		scan.nextLine(); // Clear buffer
		
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		int words_found = countWords(str_arr, sentence);
		System.out.printf("The amount of words that present in a sentence: %d\n", words_found);
		
		
		scan.close();
	}

}
