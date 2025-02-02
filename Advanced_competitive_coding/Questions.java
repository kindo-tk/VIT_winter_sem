/*
1-Count the Number of Primes Up to a Given Number
2-Sum of All Primes Up to a Given Number 
*/
import java.util.*;
public class Questions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();
        boolean isprime[] = new boolean[n+1];
        for (int i = 2;i<=n;i++)
        {
            isprime[i] = true;
        }
        for (int i = 2;i*i<=n;i++)
        {
            if (isprime[i])
            {
                for (int j = i*i;j<=n;j+=i)
                {
                    isprime[j] = false;
                }
            }
        }
        int count = 0;
        int sumall = 0;
        for (int i = 2;i<=n;i++)
        {
            if (isprime[i])
            {
                count++;
                sumall+=i;
                if (count == k)
                {
                    System.out.printf("%dth prime number is %d",k,i);
                }
            }
        }
        System.out.printf("\nTotal number of prime upto %d is %d",n,count);
        System.out.printf("\nSum of all numbers till %d is %d",n,sumall);
        for (int i =2;i<=n;i++)
        {
            if (isprime[i]==true && isprime[i+2]==true)
            {
                System.out.printf("\n%d,%d",i,i+2);
            }
        }


    }
    
}
