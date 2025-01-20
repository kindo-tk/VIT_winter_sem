import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while (org>0)
        {
            int d = org%10;
            rev = rev*10+d;
            org = org/10;
        }
        if (rev == num)
        {
            System.out.println(num+" is a palindrome number");
        }
        else
        {
            System.out.println(num+" is not a palindrome number");
        }
    }
}
