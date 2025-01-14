import java.util.*;
public class Input {
    // Input
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next(); // takes only the first token
        System.out.println("Enter your full name:");
        String fullname = sc.nextLine(); // takes only the first token        
        System.out.println("Name is "+name);
        System.out.println("Full name is "+fullname);
    }
}
