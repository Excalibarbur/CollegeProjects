package Homework4;

import java.util.Arrays;

public class task8
{

	public static char[] splitLeft(char[] arr)
	{
		char[] output = new char[arr.length / 2];
		
		for(int i = 0; i < arr.length / 2; i++)
			output[i] = arr[i];
		
		return output;
	}
	
	public static char[] splitRight(char[] arr)
	{
		int half = arr.length / 2;
		char[] output = new char[arr.length - half];
		
		for(int i = half; i < arr.length; i++)
			output[i - half] = arr[i];
		
		return output;
	}
	
	public static void mergeSort(char[] arr)
	{
	    for (int i = 0; i < arr.length - 1; i++)
	    {
	        int maxIndex = i;

	        for (int j = i + 1; j < arr.length; j++)
	        {
	            char c1 = arr[maxIndex];
	            char c2 = arr[j];

	            // השוואה לא רגישה לרישיות, מהגדול לקטן
	            if (Character.toLowerCase(c2) > Character.toLowerCase(c1) ||
	               (Character.toLowerCase(c2) == Character.toLowerCase(c1) && c2 < c1)) {
	                maxIndex = j;
	            }
	        }

	        // החלפה
	        char temp = arr[i];
	        arr[i] = arr[maxIndex];
	        arr[maxIndex] = temp;
	    }
	}

    public static char[] merge(char[] arr1, char[] arr2)
    {
        int i1 = 0, i2 = 0, index = 0;
        int len1 = arr1.length, len2 = arr2.length;
        char[] output = new char[len1 + len2];

        while (i1 < len1 && i2 < len2)
        {
            char c1 = String.valueOf(arr1[i1]).toLowerCase().charAt(0);
            char c2 = String.valueOf(arr2[i2]).toLowerCase().charAt(0);

            if(c1 > c2)
            	output[index++] = arr1[i1++];
            else output[index++] = arr2[i2++];
            
            /*
            if (Character.toLowerCase(c1) > Character.toLowerCase(c2))
            {
                output[index++] = c1;
                i1++;
            } 
            else
            {
                output[index++] = c2;
                i2++;
            }
            */
            
        }

   /*     while (i1 < len1)
            output[index++] = arr1[i1++];
        
        while (i2 < len2)
            output[index++] = arr2[i2++];
        */
        
        for(int i = i1; i < len1; i++)
	    	output[index++] = arr1[i];
	    
	    for(int i = i2; i < len2; i++)
	    	output[index++] = arr2[i];

        return output;
    }

	
	public static void main(String[] args)
	{
		char[] arr12 = {'u', 'd', 's', 'g', 'm', 'y', 'o', 'j', 'x'};
        char[] arr13 = {'Y', 'K', 'P', 'Z', 'N', 'H', 'T', 'E', 'V'};
        char[] arr14 = {'y', 'x', 'u', 's', 'o', 'm', 'j', 'g', 'd'};
        
        mergeSort(arr12);
        System.out.println("Sorted arr12: " + Arrays.toString(arr12));

        mergeSort(arr13);
        System.out.println("Sorted arr13: " + Arrays.toString(arr13));

        mergeSort(arr14);
        System.out.println("Sorted arr14: " + Arrays.toString(arr14));
	}

}
