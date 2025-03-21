/**
 * Maximum Equilibrium Sum
 */
import java.util.*;

public class Maximum_equilibrium_sum 
{
    static int findMaxSum(int[] arr, int n) 
    {
        int totalSum = 0;
        for (int i = 0; i < n; i++) 
        {
            totalSum += arr[i];
        }
        
        int prefixSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) 
        {
            int suffixSum = totalSum - prefixSum - arr[i];
            
            // Check if prefix sum equals suffix sum
            if (prefixSum == suffixSum) 
            {
                maxSum = Math.max(maxSum, prefixSum);
            }
            
            // Update prefix sum for the next element
            prefixSum += arr[i];
        }
        
        // If no equilibrium found, return 0
        return (maxSum == Integer.MIN_VALUE) ? 0 : maxSum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int result = findMaxSum(arr, n);
        System.out.println("Maximum Equilibrium Sum: " + result);
    }
}

