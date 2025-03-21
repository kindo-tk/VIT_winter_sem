/*
 * Karatsuba algorithm is a fast multiplication algorithm that uses a divide-and-conquer approach to multiply two numbers.
 * It is more efficient than the standard multiplication algorithm for large numbers.
 */
import java.util.*;
public class Karatsuba 
{
    // Main method to test the Karatsuba algorithm
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long x = sc.nextLong();
        System.out.print("Enter the second number: ");
        long y = sc.nextLong();
        long result = karatsuba(x, y);
        System.out.println("Product: " + result);
        sc.close();
    }

    // Karatsuba multiplication method
    public static long karatsuba(long x, long y) 
    {
        // Handle negative numbers
        boolean isNegative = false;
        if (x < 0 && y > 0) 
        {
            isNegative = true;
            x = Math.abs(x);
        } 
        else if (x > 0 && y < 0) 
        {
            isNegative = true;
            y = Math.abs(y);
        }
        else if (x < 0 && y < 0) 
        {
            x = Math.abs(x);
            y = Math.abs(y);
        }

        // Base case: if either number is single-digit, multiply directly
        if (x < 10 || y < 10) 
        {
            long result = x * y;
            return isNegative ? -result : result;
        }

        // Find the number of digits in the larger number
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int halfN = (n + 1) / 2; // Ceiling of n/2 to ensure proper splitting

        // Split the numbers into two parts
        long power = (long) Math.pow(10, halfN);
        long a = x / power; // High part of x
        long b = x % power; // Low part of x
        long c = y / power; // High part of y
        long d = y % power; // Low part of y

        // Recursive steps
        long p1 = karatsuba(a, c); // a * c
        long p2 = karatsuba(b, d); // b * d
        long p3 = karatsuba(a + b, c + d); // (a + b) * (c + d)
        long p4 = p3 - p1 - p2; // (a*d + b*c)

        // Combine the results
        long result = p1 * (long) Math.pow(10, 2 * halfN) + p4 * (long) Math.pow(10, halfN) + p2;

        // Apply the sign
        return isNegative ? -result : result;
    }
}