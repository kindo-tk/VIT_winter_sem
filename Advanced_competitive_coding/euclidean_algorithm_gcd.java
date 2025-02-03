import java.util.*;
public class euclidean_algorithm_gcd
{
    public static int gcd(int a, int b)
    {
        if (a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.printf("GCD of %d and %d is %d",a,b,gcd);
        
    }
}