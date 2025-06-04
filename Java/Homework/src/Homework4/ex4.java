package Homework4;

public class ex4
{

	/*
	 * Hello World
	 * [H] [e] [l] [l] [o] [ ] [w] [o] [r] [l] [d]
	 * [0] [1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
	 * 
	 * 
	 * H
	 * l
	 * o
	 * w
	 * r
	 * d
	 * 
	 * drwolH
	 * Hlowrd
	 * 
	 */
	
	
	public static String getEvenIndexLetters(String str, int index, String out)
	{
		if(index >= str.length())
			return out;
		
		if(index % 2 != 0)
			return getEvenIndexLetters(str, index + 1, out);
		
		out += str.charAt(index);
		
//		return getEvenIndexLetters(str, index + 2, out);
		return getEvenIndexLetters(str, index + 1, out);
	}
	
	public static String getEvenIndexLetters(String str)
	{
		return getEvenIndexLetters(str, 0, "");
	}
	
	
	
	/*public static String getEvenIndexLetters(String str)
	{
		String letters[] = str.split("");
		String totalOut = "";
		
		if(letters.length >= 2)
		{
			String newStr = "";
			for(int i = 2; i < letters.length; i++)
				newStr += letters[i];
			
			totalOut = getEvenIndexLetters(newStr);
		}
		
		totalOut = letters[0] + totalOut;
		return totalOut;
	}*/
	
	public static void main(String[] args)
	{
		System.out.println(getEvenIndexLetters("Hello world"));
		System.out.println(getEvenIndexLetters("Hello, world"));
		
	}

}
