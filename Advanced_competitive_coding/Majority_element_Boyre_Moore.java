/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than n/2 times.
 * Time complexity = O(n)
 * Space complexity = O(1)
 * Input: arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4}
 * Output: Majority element is 4
 * The Boyer-Moore Voting Algorithm is used to find the majority element in an array.
 * It works by maintaining a count, which is incremented when the current element is the same as the candidate element,
 * and decremented when it is different. When the count reaches zero, the candidate element is updated to the current element.
 * In the end, a second pass is made to verify that the candidate element is indeed the majority element.
 */
import java.util.*;
public class Majority_element_Boyre_Moore 
{
    public static int findMajorityElement(int[] arr)
    {
        int n = arr.length;
        int count = 0;
        int ele = 0;
        for (int i = 0;i<n;i++)
        {
            if(count == 0)
            {
                ele = arr[i];
                count = 1;
            }
            else if(ele == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == ele)
            {
                count1++;
            }
        }
        if(count1 > n/2)
        {
            return ele;
        }
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = findMajorityElement(arr);
        if(res == -1)
        {
            System.out.println("Majority element does not exist");
        }
        else
        {
            System.out.println("Majority element is: "+res);
        }
    }
}
