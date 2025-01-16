import java.util.*;
public class BinaryPalindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int s = sc.nextInt();
        String k = Integer.toBinaryString(s);
        int i = 0, j = k.length()-1;
        boolean ispalindrome = true;
        while(i<=j)
        {
            if (k.charAt(i)!=k.charAt(j))
            {
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(ispalindrome)
        {
            System.out.printf("Binary equivalent of %d is %s and it is palindrome",s,k);
        }
        else
        {
            System.out.printf("Binary equivalent of %d is %s and it is not palindrome",s,k);

        }

    }
}
