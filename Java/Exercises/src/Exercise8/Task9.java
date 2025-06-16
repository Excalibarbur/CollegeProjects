package Exercise8;

public class Task9
{

	public static boolean isPow3(int num)
	{
		if(num == 1)
			return true;
		
		if(num % 3 != 0)
			return false;
		
		return isPow3(num / 3);
	}

	public static void main(String[] args)
	{
		System.out.println(isPow3(9));
		System.out.println(isPow3(12));
		System.out.println(isPow3(27));
	}

}
