package Homework4;

public class task1
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
		int[] arr_cars = { 12345, 65432, 21897, 90876, 76408 };
		String[] arr_owners = { "adar", "Erez", "Omer", "sapir", "tamar" };
		
		int carNumber = findCarOwner(arr_cars, arr_owners);
		System.out.println(carNumber);
	}

}
