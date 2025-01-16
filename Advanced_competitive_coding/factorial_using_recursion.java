/**
 * Factorial of a number with recursion
 */
import java.util.*;
public class factorial_using_recursion {
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
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
