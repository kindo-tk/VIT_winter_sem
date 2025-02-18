/**
 * Given an array A of positive integers. The task is to find the leaders in the array. 
 * An element of array is leader if it is greater than or equal to all the elements to its right side. 
 * The rightmost element is always a leader.
 * Eg: [2,4,6,3,1,2] here leaders are 2,3,6
 */
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Leader_in_array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr = new int [size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ;i < size ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int rightmax = arr[size-1];
        System.out.print(rightmax+" ");
        for(int i = size-2;i>=0;i--)
        {
            if(arr[i]>rightmax)
            {
                rightmax = arr[i];
                System.out.print(rightmax+" ");
            }
        }
    }
}
