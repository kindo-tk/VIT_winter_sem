import java.util.*;
public class PalindromeString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String word = sc.next();
        int i = 0;
        int j = word.length()-1;
        boolean ispalindrome = true;
        while(i<=j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (ispalindrome)
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not palindrome!");
        }
    }
}
