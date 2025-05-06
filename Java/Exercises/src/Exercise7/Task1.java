package Exercise7;

public class Task1
{

	public static void main(String[] args)
	{
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++)
			arr[i] = 10 * (i + 1);
		
		
		// Print the result
		for(int index : arr)
			System.out.println(index);
	}

}
