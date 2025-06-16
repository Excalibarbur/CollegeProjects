package Homework4;

public class task2
{

	public static String findSubstring(String str)
	{
		char[] arr = str.toCharArray();

		int start = 0;
		int currLength = 0;
		
		int maxStart = 0;
		int maxLength = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			char c = arr[i];
			
			if(currLength == 0)
			{
				start = i;
				currLength = 1;
			}
			else
			{
				if (c == arr[i - 1] + 1 || (c == '0' && arr[i - 1] == '9'))
				{
					currLength++;
				}
				else
				{
					start = i;
					currLength = 1;
				}
			}
			
			if(currLength > maxLength)
			{
				maxStart = start;
				maxLength = currLength;
			}
		}
		
		String out = str.substring(maxStart, maxStart + maxLength);
		return out;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findSubstring("125637891")); // Output: 789
        System.out.println(findSubstring("123567890127891")); // Output: 56789012
        System.out.println(findSubstring("34512348901234")); // Output: 8901234
	}

}
