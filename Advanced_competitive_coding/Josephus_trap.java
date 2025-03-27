/**
Given the total number of persons n and a number k which
indicates that k-1 persons are skipped and 
kth person is killed in circle. 
The task is to choose the place in the initial 
circle so that you are the last one remaining 
and so survive.

Time complexity : O(n)
Space complexity: O(n)
 */

import java.util.*;
public class Josephus_trap
{
    public static int josephus(int n , int k)
    {
        if (n == 1)
            return 1;
        else
            return (josephus(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n, i.e total number of people:");
        int n = sc.nextInt();
        System.out.print("Enter the value of k, i.e number of people to be skipped:");
        int k = sc.nextInt();
        System.out.print("The last person surviving is:"+josephus(n, k));
        
    }
}
