import java.util.*;

public class Segmented_seive 
{
    static int N = 100000;
    static boolean arr[] = new boolean[N + 1];

    // Simple Sieve to find all primes up to N
    public static void simpleSieve() 
    {
        for (int i = 2; i <= N; i++) 
        {
            arr[i] = true; // Assume all numbers are prime
        }

        for (int i = 2; i <= Math.sqrt(N); i++) 
        {
            if (arr[i]) 
            { // If i is prime
                for (int j = i * i; j <= N; j += i) 
                {
                    arr[j] = false; // Mark all multiples of i as non-prime
                }
            }
        }
    }

    // Generate primes up to sqrt(n) using the simple sieve
    static ArrayList<Integer> generatePrimes(int n) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (arr[i]) 
            {
                al.add(i); // Add prime numbers to the list
            }
        }
        return al;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt(); // Lower bound of the range
        int high = sc.nextInt(); // Upper bound of the range

        // Precompute primes up to sqrt(N)
        simpleSieve();

        // Get primes up to sqrt(high)
        ArrayList<Integer> al = generatePrimes(high);

        // Array to mark numbers in the range [low, high]
        boolean dummy[] = new boolean[high - low + 1];
        for (int i = 0; i < dummy.length; i++) 
        {
            dummy[i] = true; // Assume all numbers in range are prime
        }

        // Mark non-prime numbers in [low, high]
        for (int prime : al)
        {
            // Find the first multiple of prime within the range
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) 
            {
                firstMultiple += prime;
            }

            // Ensure we start marking from prime * prime
            int start = Math.max(firstMultiple, prime * prime);

            // Mark all multiples of prime in the range
            for (int j = start; j <= high; j += prime) 
            {
                dummy[j - low] = false; // Mark as non-prime
            }
        }

        // Print all primes in the range
        for (int i = low; i <= high; i++) 
        {
            if (dummy[i - low]) {
                System.out.print(i + " ");
            }
        }
    }
}
