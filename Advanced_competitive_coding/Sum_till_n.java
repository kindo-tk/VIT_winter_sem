import java.util.*;
public class Sum_till_n {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of all natural number till "+n+" is "+ sum);
    }
}
