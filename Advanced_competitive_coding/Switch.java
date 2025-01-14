/**
 * using switch statements
 */
import java.util.*;
public class Switch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Invalid choice");
        }

        }
}