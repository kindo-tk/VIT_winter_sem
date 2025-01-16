/**
 * Program to find all prime numbers till n
 */
import java.util.*;
public class Seive_of_Erathosthenes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        boolean isprime[] = new boolean[n+1];
        for (int i = 2;i<=n;i++)
        {
            isprime[i]=true;
        }
        for (int i = 2;i*i<=n;i++)
        {
            if (isprime[i])
            {
                for (int j = i*i;j<=n;j=j+i)
                {
                    isprime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers till "+n+" :");
        for (int i = 2;i<=n;i++)
        {
            if(isprime[i])
            {
                System.out.println(i);
            }
        }
    }
}
