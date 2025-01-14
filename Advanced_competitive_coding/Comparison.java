/**
 * Comparison of 2 numbers using only if-else
 */
import java.util.*;
public class Comparison {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("a and b are equal");
        }
        else
        {
            if(a>b)
            {
                System.out.println("a is greater than b");
            }
            else
            {
                System.out.println("a is less than b");
            }
        }
    }
    
}
