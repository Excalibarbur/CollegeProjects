package Exercise5;

public class Task7
{
	
	public static int keyThingy(int x, int key)
	{
		int result = 0;
		
		int tmp = x;
		int amp = 1;
		while(tmp != 0)
		{
			int digit = tmp % 10;
			
			for(int i = 0; i < key; i++)
			{
				if(digit == 9)
					digit = 0;
				else digit++;
			}
			
			result = digit * amp + result;
			
			amp *= 10;
			tmp /= 10;
		}
		
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(keyThingy(7894, 4));
//		System.out.println(keyThingy(1238, 10-4)); // Decryption :D
	}

}
