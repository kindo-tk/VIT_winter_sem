import java.util.*;
public class nearest_tenth_multiple 
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int d = n%10;
        int result = n/10;
        if(d<=5)
        {
            result = result*10;
        }
        else
        {
            result = (result+1)*10;
        }
        System.out.print("Nearest tenth multiple of the number is"+result);

    }
}
