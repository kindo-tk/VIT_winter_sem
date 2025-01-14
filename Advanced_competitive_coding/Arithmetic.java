import java.util.*;
public class Arithmetic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        int quotient = a/b;
        System.out.println("Sum: "+a+" + "+b+" = "+sum);
        System.out.println("Difference: "+a+" - "+b+" = "+diff);
        System.out.println("Product: "+a+" * "+b+" = "+product);
        System.out.println("Quotient: "+a+" / "+b+" = "+quotient);
    }
    
}
