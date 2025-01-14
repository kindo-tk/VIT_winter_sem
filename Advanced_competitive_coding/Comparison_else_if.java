/**
 * to compare two number using else if statement
 */
import java.util.*;
public class Comparison_else_if {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if (a>b)
        {
            System.out.println("a is greater than b");
        }
        else if (b>a)
        {
            System.out.println("b is greater than a");
        }
        else
        {
            System.out.println("a nd b are equal");
        }
    }
    
}
