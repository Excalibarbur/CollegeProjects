package Homework4;

public class b1
{

	public static int findCarOwner(int[] carNumbers, String[] owners)
	{
		for(int i = 0; i < owners.length; i++)
		{
			String owner = owners[i].toLowerCase();
			
			String[] splitted = owner.split("");
			String captured = "";
			boolean valid = true;
			
			for(String ch : splitted)
			{
				if(captured.contains(ch))
				{
					valid = false;
					break;
				}
				else 
					captured += ch;
			}
			
			if(valid == true)
				return carNumbers[i];
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] carNumbers = {12345, 65432, 21897, 90876, 76408};
        String[] owners = {"adar", "Erez", "Omer", "sapir", "tamar"};

        // Test the findCarOwner function
        int carNumber = findCarOwner(carNumbers, owners);

        // Display the result
        if (carNumber != -1) {
            System.out.println("Car number of the first owner with a valid name: " + carNumber);
        } else {
            System.out.println("No valid owner name found.");
        } //Output: 21897
	}

}
