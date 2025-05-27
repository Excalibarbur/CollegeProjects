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
import Homework4.*;

import java.util.Arrays;
/**
 * This class includes a set of recursive functions
 * Important note: I remind you that good coding practice should avoid code redundancy, you should have nearly all methods at 5-10 lines or fewer.
 * If you need to write longer methods, you should break them up into multiple smaller methods.
 *
 * @author Yael Veksler
 */
public class HW4a {

    ///////Insert your code here. //////////////

    /**
     * Main method for testing the implemented functions.
     */
    
    public static void main(String[] args) {
        //---------------Q1---------------------
        int[] arr = {3, 32, 12, 4, 8};
        System.out.println("Max value in array: " + ex1.findMax(arr)); // Max value in array: 32

        //---------------Q2---------------------
        String str1 = "abba";
        String str2 = "t6r6t";
        String str3 = "hello";
        System.out.println("Is \"" + str1 + "\" a palindrome? " + ex2.isPalindrome(str1)); // Is "abba" a palindrome? true
        System.out.println("Is \"" + str2 + "\" a palindrome? " + ex2.isPalindrome(str2)); // Is "t6r6t" a palindrome? true
        System.out.println("Is \"" + str3 + "\" a palindrome? " + ex2.isPalindrome(str3)); // Is "hello" a palindrome? false

        //---------------Q3---------------------
        String text = "This is a test string";
        String word = "test";
        System.out.println("Word found: " + ex3.searchWord(text, word)); // Word found: true

        //---------------Q4---------------------
        String str = "Hello world";
        System.out.println("Even index letters: " + ex4.getEvenIndexLetters(str)); // Even index letters: Hlowrd

        //---------------Q5---------------------
        int n1 = 2, m1 = 8;
        System.out.println("Is " + m1 + " a power of " + n1 + "? " + ex5.isPower(n1, m1)); // Is 8 a power of 2? true

        int n2 = 3, m2 = 6;
        System.out.println("Is " + m2 + " a power of " + n2 + "? " + ex5.isPower(n2, m2)); // Is 6 a power of 3? false

        //---------------Q6---------------------
        int[] arr1 = {3, 8, 15, 97, 6};
        int sum1 = 9;
        System.out.println("Subset with sum " + sum1 + " exists: " + ex6.subsetSum(arr1, sum1)); // Subset with sum 9 exists: true

        int[] arr2 = {4, 5, 87, 2, 12, 3};
        int sum2 = 13;
        System.out.println("Subset with sum " + sum2 + " exists: " + ex6.subsetSum(arr2, sum2)); // Subset with sum 13 exists: false

        //---------------Q7---------------------
        int n = 10;
        System.out.println("Tribonacci element at index " + n + ": " + ex7.tribonacciElement(n)); // Tribonacci element at index 10: 81

       
    }

}
