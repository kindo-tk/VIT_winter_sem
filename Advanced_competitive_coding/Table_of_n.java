import java.util.*;
public class Table_of_n {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table you want:");
        int n = sc.nextInt();
        System.out.println("Table of "+n);
        for(int i = 1; i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);

        }
    }
}
