/**
 * Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */
import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        float b = sc.nextFloat();
        System.out.println("Enter the operator (+,-,/,*,%)");
        String ch = sc.next();
        switch(ch)
        {
            case "+":
                System.out.println("Sum of a and b is: "+ (a+b));
                break;            
            case "-":
                System.out.println("Difference between a and b is:"+ (a-b));
                break;
            case "*":
                System.out.println("Product of a and b is: "+ a*b);
                break;
            case "/":
                System.out.println("a when divided by b gives quotient:"+ a/b);
                break;
            case "%":
                System.out.println("a when divided by b gives remainder:"+ a%b);
                break;
            default:
                System.out.println("Enter a valid operator!");


        }
    }
    
}
