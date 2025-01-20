/**
 * This program gives the smallest number which when divided by the elements in the num array4
 * gives the elements in the rem array.
 */
import java.util.Scanner;
public class Remainder_theorem 
{
    public static int findSmallestNumber(int[] num, int[] rem, int k) 
    {
        int n = 1;
        while (true)
        {
            boolean valid = true;
            for (int i = 0; i < k; i++) 
            {
                if (n % num[i] != rem[i]) 
                {
                    valid = false;
                    break;
                }
            }
            if (valid) 
            {
                return n;
            }
            n++;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays (k): ");
        int k = sc.nextInt();
        if (k <= 0) 
        {
            System.out.println("Invalid size! Exiting program.");
            return;
        }

        int[] num = new int[k];
        int[] rem = new int[k];

        // Input elements of num array
        System.out.println("Enter the elements of the num array:");
        for (int i = 0; i < k; i++) 
        {
            num[i] = sc.nextInt();
            if (num[i] <= 0) 
            {
                System.out.println("Numbers must be positive! Exiting program.");
                return;
            }
        }

        // Input elements of rem array
        System.out.println("Enter the elements of the rem array:");
        for (int i = 0; i < k; i++) 
        {
            rem[i] = sc.nextInt();
            if (rem[i] < 0 || rem[i] >= num[i]) 
            {
                System.out.println("Remainders must be in the range [0, num[i])! Exiting program.");
                return;
            }
        }
        int smallest = findSmallestNumber(num, rem, k);
        System.out.println("The smallest number that satisfies the conditions is: " + smallest);
    }
}
