/**
 * here instead of running the loop till n we run the loop till root(n) to reduce the time complexity.
 * Time complexity O(root(n))
 */
import java.util.*;
public class Euler_phi_better_approach 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int result = n;
        int org = n;
        for (int p = 2;p*p<=n;p++)
        {
            if (n%p==0)
            {
                while(n%p==0)
                {
                    n = n/p;
                }
                result -= result/p;
            } 
        }
        if (n>1)
        {
            result = result - result/n;
        }
        System.out.printf("Number of positive integers that are less than %d and relatively prime to %d is %d",org,org,result);
    }
    
}
