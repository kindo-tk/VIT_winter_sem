import java.util.*;
public class Circlearea {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is: "+area+" sq units");

    }
}
