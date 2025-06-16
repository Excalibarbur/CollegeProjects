package Exercise8;

public class Task10
{

	public static String getPrefix(String[] arr)
	{
		String out = "";
		String base = arr[0];
		
		int min = Integer.MAX_VALUE;
		for(String word : arr)
		{
			if(word.length() < min)
				min = word.length();
		}
		
		for(int i = 0; i < min - 1; i++)
		{
			for(int j = 1; j < arr.length; j++)
			{
				if(arr[j].charAt(i) != base.charAt(i))
					return out;
			}
			out += base.charAt(i);
		}
		
		return out;
	}
	
	public static void main(String[] args)
	{
		String []arr = {"flower", "flowy", "flight"};
		System.out.println(getPrefix(arr));
	}

}
