/*
 * Be sure to submit your work in a folder called introtocsHW4
 *
 * Some words about submission:
 * Code that does not compile will receive a grade of 0.
 * Code must rigorously follow style guidelines. (15 points)
 * Code must work without bugs exactly as described in the API and assignment instructions(50 points).
 *
 * We use software to detect cheating.
 * Copying from anywhere, online or otherwise, using chat GPT or similar
 * software, or in any way collaborating with another student is cheating and
 * will earn the student a grade of 0.
 *
 * Questions regarding this assignment should be addressed in the moodle forum.
 * Questions about this assignment sent in mail would not be responded
 *
 */

//package introtocsHW4;
package Homework4;


import java.util.Arrays;
/**
 * This class includes a set of Search Algorithms functions
 * Important note: I remind you that good coding practice should avoid code redundancy, you should have nearly all methods at 5-10 lines or fewer.
 * If you need to write longer methods, you should break them up into multiple smaller methods.
 *
 * @author Yael Veksler
 */
public class HW4b {

    ///////Insert your code here. //////////////

    /**
     * Main method for testing the implemented functions.
     */
    public static void main(String[] args) {
        System.out.println("---------------Q1---------------------");
        // Sample car numbers and owners data
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

        System.out.println("---------------Q2---------------------");
        System.out.println(findSubstring("125637891")); // Output: 789
        System.out.println(findSubstring("123567890127891")); // Output: 56789012
        System.out.println(findSubstring("34512348901234")); // Output: 8901234

        System.out.println("---------------Q3---------------------");
        int[] arr1 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr2 = {-15, -5, 3, 7, 15, 97, 100};
        int k1 = 15, k2 = 12;
        int stepSize = 3;

        System.out.println("Amount of elements smaller than 15: " + jumpSearch(arr1, k1, stepSize)); // Output: 6
        System.out.println("Amount of elements smaller than 12: " + jumpSearch(arr2, k2, stepSize)); // Output: 4

        System.out.println("---------------Q4---------------------");
        int[] arr3 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr4 = {-15, -5, 3, 7, 15, 97};
        int num1 = 15;
        int num2 = 12;

        System.out.println(ternarySearch(arr3, num1)); // Output: 6
        System.out.println(ternarySearch(arr4, num2)); // Output: -1

        System.out.println("---------------Q5---------------------");
        int[] arr5 = {21, 4, 19, 7, 13, 25, 15, 10, 24};
        int[] arr6 = {24, 10, 15, 25, 13, 7, 19, 4, 21};
        int[] arr7 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr8 = {25, 24, 21, 19, 15, 13, 10, 7, 4};
        
        System.out.println("Amount of moves for arr5: " + insertionSort(arr5)); // Expected: 21
        System.out.println("Sorted arr5: " + Arrays.toString(arr5));

        System.out.println("Amount of moves for arr6: " + insertionSort(arr6)); // Expected: 15
        System.out.println("Sorted arr6: " + Arrays.toString(arr6));

        System.out.println("Amount of moves for arr7: " + insertionSort(arr7)); // Expected: 36
        System.out.println("Sorted arr7: " + Arrays.toString(arr7));

        System.out.println("Amount of moves for arr8: " + insertionSort(arr8)); // Expected: 0
        System.out.println("Sorted arr8: " + Arrays.toString(arr8));

        System.out.println("---------------Q6---------------------");
        System.out.println("Amount of swaps for arr5: " + bubbleSortReverse(arr5)); // Expected: 21
        System.out.println("Sorted arr5: " + Arrays.toString(arr5));

        System.out.println("Amount of swaps for arr6: " + bubbleSortReverse(arr6)); // Expected: 15
        System.out.println("Sorted arr6: " + Arrays.toString(arr6));

        System.out.println("Amount of swaps for arr7: " + bubbleSortReverse(arr7)); // Expected: 36
        System.out.println("Sorted arr7: " + Arrays.toString(arr7));

        System.out.println("Amount of swaps for arr8: " + bubbleSortReverse(arr8)); // Expected: 0
        System.out.println("Sorted arr8: " + Arrays.toString(arr8));

        System.out.println("---------------Q7---------------------");
        char[] arr9 = {'u', 'd', 's', 'g', 'm', 'y', 'o', 'j', 'x'};
        char[] arr10 = {'Y', 'K', 'P', 'Z', 'N', 'H', 'T', 'E', 'V'};
        char[] arr11 = {'y', 'x', 'u', 's', 'o', 'm', 'j', 'g', 'd'};
        
        System.out.println("Amount of swaps for arr9: " + bubbleSort(arr9)); // Expected: 15
        System.out.println("Sorted arr9: " + Arrays.toString(arr9));

        System.out.println("Amount of swaps for arr10: " + bubbleSort(arr10)); // Expected: 21
        System.out.println("Sorted arr10: " + Arrays.toString(arr10));

        System.out.println("Amount of swaps for arr11: " + bubbleSort(arr11)); // Expected: 36
        System.out.println("Sorted arr11: " + Arrays.toString(arr11));

        System.out.println("---------------Q8---------------------");
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
