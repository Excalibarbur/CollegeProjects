package Exercise2;
import java.util.Scanner;

public class Task5
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = scan.nextInt();
		
		if(age >= 18)
			System.out.println("You are an adult.");
		else if(age < 18 && age >= 13)
			System.out.println("You are a teenager.");
		else if(age < 13)
			System.out.println("You are a child.");
		
		scan.close();
	}

}
