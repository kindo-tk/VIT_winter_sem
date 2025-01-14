import java.util.*;
public class Isprime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num<2)
        {
            System.out.println("Not prime");
        }
        else
        {
            boolean is_prime = true;
            for (int i = 2;i*i<=num;i++)
            {
                if (num%i==0)
                {
                    is_prime= false;
                    break;
                }
            }
        if (is_prime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
        }
    }
}
