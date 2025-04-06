package Exercise3;

public class Task5
{

	public static void main(String[] args)
	{
		System.out.print("All palindrome numbers from 1000 to 9999: ");
		for(int i = 1000; i <= 9999; i++)
		{
			int reversed = 0;
			int tmp = i;
			while(tmp != 0)
			{
				int digit = tmp % 10;
				reversed = reversed * 10 + digit;
				tmp /= 10;
			}
			
			if(i == reversed)
				System.out.print(i + ((i == 9999) ? "" : ", "));
//				System.out.print(i + " ");
		}
	}

}
