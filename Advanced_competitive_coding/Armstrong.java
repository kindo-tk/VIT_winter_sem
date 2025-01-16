import java.util.*;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int size = String.valueOf(num).length();
        int org = num;
        double sum = 0;
        while(org>0)
        {
            int d = org % 10;
            sum += Math.pow(d, size);
            org = org/10;
        }
        if (sum == num)
        {
            System.out.println(num+" is an Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }
        

    }
}
