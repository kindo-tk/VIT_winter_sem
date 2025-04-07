/**
 * Generate All Combinations of r Elements from a Set of n Elements
 * This Java program generates and prints all possible combinations 
 * of size r from a given array of integers. 
 * It uses recursion and backtracking to explore all combinations.
 */

import java.util.*;

public class Combination 
{

    // Recursive method to generate all combinations of size r
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) 
    {
        // Base case: If current combination is ready, print it
        if (index == r) 
        {
            for (int j = 0; j < r; j++)
            {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }

        // Replace index with all possible elements from start to end
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) 
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    // Wrapper function that initializes data[] and calls combinationUtil
    static void printCombination(int arr[], int n, int r) 
    {
        int data[] = new int[r]; // Temporary array to store current combination
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Reading input array as comma-separated string
        System.out.print("Enter array elements (comma separated): ");
        String input = sc.nextLine();
        String[] parts = input.split(",");

        // Converting to integer array
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) 
        {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        // Taking value of r as input
        System.out.print("Enter r (size of combinations): ");
        int r = sc.nextInt();

        // Calling the combination function
        printCombination(arr, arr.length, r);
    }
}
