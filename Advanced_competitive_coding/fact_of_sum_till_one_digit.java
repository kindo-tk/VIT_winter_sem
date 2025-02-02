/**
 * This program finds the sum of a number till becomes single digit 
 * then computes it's factorial.
 */
import java.util.*;
public class fact_of_sum_till_one_digit
{
    public static int fact(int n)
    {
        if (n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        while(n>=10)
        {
            int sum = 0;
            while(n>0)
            {
                sum+=n%10;
                n/=10;
            }
            n = sum;
        }
        int result = fact(n);
        System.out.print(result);

    }
}