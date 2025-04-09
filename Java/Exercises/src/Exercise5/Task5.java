package Exercise5;
import java.lang.Math;
import java.util.Scanner;

public class Task5
{
	
	public static void GuessingGame()
	{
		Scanner scan = new Scanner(System.in);
		
		int randomInt = (int)(Math.random() * 100 + 1);
		while (true)
		{
			System.out.print("Guess the number: ");
			int selectedInt = scan.nextInt();
			
			if(selectedInt == randomInt)
			{
				System.out.println("You guessed it!");
				scan.close();
				break;
			}
			else if (selectedInt < randomInt)
				System.out.println("Bigger");
			else if (selectedInt > randomInt)
				System.out.println("Smaller");
		}
	}

	public static void main(String[] args)
	{
		GuessingGame();
	}

}
