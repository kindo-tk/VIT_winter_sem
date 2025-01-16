/**
 * This gives the number of positive integers less than n that are relatively prime to n.
 * here we run the loop till n.
 * Time complexity : O(nlogn)
 */
import java.util.*;
public class Eulers_phi_till_n
{
    public static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static int euler_phi(int n)
    {
        int result = 1;
        for (int i = 2;i<=n;i++)
        {
            if (gcd(i,n)==1)
                result++;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int k = euler_phi(n);
        System.out.printf("Number of positive integers that are less than %d and relatively prime to %d is %d",n,n,k);
    }
}