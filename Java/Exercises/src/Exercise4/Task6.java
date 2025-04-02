package Exercise4;

public class Task6
{
	
	public static float BMI(float weight, float height)
	{
		float result = weight / power(height, 2);
		return result;
	}
	
	public static float power(float x, float powerBy)
	{
		for(int i = 0; i < powerBy - 1; i++)
			x = x * x;
		return x;
	}

	public static void main(String[] args)
	{
		float bmi_result = BMI(70.0f, 1.73f);

		if(bmi_result < 18.5)
			System.out.println("תת-משקל (Underweight)");
		else if(bmi_result >= 18.5 && bmi_result <= 24.9)
			System.out.println("משקל תקין (Normal weight)");
		else if(bmi_result >= 25 && bmi_result <= 29.9)
			System.out.println("עודף משקל (Overweight)");
		else if(bmi_result >= 30)
			System.out.println("השמנת יתר (Obesity)");
	}

}
