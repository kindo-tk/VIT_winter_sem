/**
 * Given a binary array, find the length of the longest sequence of 1’s formed by replacing at-most k zeroes by ones.
 * Eg: [1,1,0,0,1,1,1,0,1,1] k=2
 * Output: 7
 */
import java.util.*;
public class Longest_sequence_ones 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();
        System.out.print(Ones(arr,k));
    }
    
    public static int Ones(int arr[], int k)
    {
        int max = 0;
        int start = 0;
        int zerocount = 0;
        for(int end = 0;end<arr.length;end++)
        {
            if(arr[end]==0)
            {
                zerocount++;
            }
            while(zerocount>k)
            {
                if(arr[start]==0)
                {
                    zerocount--;
                }
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
