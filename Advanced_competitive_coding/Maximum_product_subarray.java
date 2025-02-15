/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * Time complexity = O(n)
 * Space complexity = O(1)
 */
import java.util.*;
public class Maximum_product_subarray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }       
        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0;i<n;i++)
        {
            if(prefix == 0)
            {
                prefix = 1;
            }
            if(suffix == 0)
            {
                suffix = 1;
            }
            prefix *= arr[i];
            suffix *= arr[n-i-1];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        System.out.println("Maximum product of subarray is: "+ans);
    }
}
