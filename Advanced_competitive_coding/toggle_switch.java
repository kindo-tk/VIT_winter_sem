import java.util.*;
public class toggle_switch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        boolean switches[] = new boolean[n+1];
        for(int i = 1;i<=n;i++)
        {
            for(int j = i;j<=n;j+=i)
            {
                switches[j] = !switches[j];
            }
        }
        System.out.println("Final switch states:");
        for (int i =1;i<=n;i++)
        {
            System.out.print(switches[i]?"ON ":"OFF ");
        }
    }    
}
