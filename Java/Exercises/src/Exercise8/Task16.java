package Exercise8;

public class Task16
{
	
	public static String addBinary(String a, String b, int carry)
	{
	    if (a.length() == 0 && b.length() == 0 && carry == 0)
	        return "";

	    int bitA = (a.length() > 0) ? a.charAt(a.length() - 1) - '0' : 0;
	    int bitB = (b.length() > 0) ? b.charAt(b.length() - 1) - '0' : 0;

	    int sum = bitA + bitB + carry;
	    int digit = sum % 2;
	    int newCarry = sum / 2;

	    String nextA = (a.length() > 0) ? a.substring(0, a.length() - 1) : "";
	    String nextB = (b.length() > 0) ? b.substring(0, b.length() - 1) : "";

	    return addBinary(nextA, nextB, newCarry) + digit;
	}


	public static void main(String[] args)
	{
		System.out.println(addBinary("1010", "1011", 0));
	}

}
