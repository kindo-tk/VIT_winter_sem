import java.util.*;
public class Strobogrammatic{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        String s = sc.next();
        String s1 = "";
        for (int i = s.length()-1;i>=0;i--)
        {   char c = s.charAt(i);
            if (c == '0' || c=='1'|| c=='8')
                s1+=c;
            else if (c=='6')
                s1+='9';
            else if (c=='9')
                s1+='6';
            else
            {
                System.out.println("Not a Strobogrammatic number");
                return;
            }
        }
        if(s1.equals(s))
        {
            System.out.println("Strobogrammatic number");
        }
        else{
            System.out.println("Not Strobogrammatic number.");
        }
    }
}