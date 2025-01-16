/**
 * Factorial of a number without using recursion
 */
import java.util.*;
public class factorial_function {
    public static int fact(int n)
    {
        int product = 1;
        for (int i =1;i<=n;i++)
            product*=i;
        return product;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found:");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.printf("Factorial of %d is %d",num,factorial);
    }
}
