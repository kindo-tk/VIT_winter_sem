/**
 * Take the length and width of a rectangle as input and calculate it's
 * Area and perimeter.
 */
import java.util.*;;
public class Rectangle_area_perimeter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle:");
        float width = sc.nextFloat();
        float area = length * width;
        float perimeter = 2*(length+width);
        System.out.println("Area of the rectangle is: "+area+" sq unit");
        System.out.println("Perimeter of the rectangle is: "+ perimeter+" units"); 
    }
}
