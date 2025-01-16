import java.util.*;
public class sum_function {
    public static double sum(double a, double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double a = sc.nextDouble();
        System.out.print("Enter the second number:");
        double b = sc.nextDouble();
        double result = sum(a,b);
        System.out.printf("Sum of %.2f and %.2f is %.2f",a,b,result);
    }
}
