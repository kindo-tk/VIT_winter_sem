/**
 * Blockswap algorithm for array rotation.
 */
import java.util.*;
public class Blockswap
{
    public static void rotateArray(int[] arr, int d) 
    {
        int n = arr.length;
        d = d % n;
        if (d == 0)
            return; 
        swap(arr, 0, d - 1); 
        swap(arr, d, n - 1); 
        swap(arr, 0, n - 1); 
    }
    public static void swap(int[] arr, int start, int end) 
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }          

    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotations:");
        int rotations = sc.nextInt();
        System.out.println("Original array:");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
        rotateArray(arr, rotations);
        System.out.println("\nRotated array:");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }
}
