package Exercise8;

public class Task1
{
	
	public static void printTriangle(int num, char c)
	{
		if(num > 1)
			printTriangle(num-1, c);
		
		for(int i = 0; i < num; i++)
			System.out.print(c);
		
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		printTriangle(5, '*');
	}

}
