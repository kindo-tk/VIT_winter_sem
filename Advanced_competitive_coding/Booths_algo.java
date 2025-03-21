/*
 * Booth's Algorithm is a multiplication algorithm that multiplies two signed binary numbers in two's complement 
 * notation.
 */
import java.util.*;

public class Booths_algo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplicand: ");
        int multiplicand = sc.nextInt(); // M
        System.out.print("Enter the multiplier: ");
        int multiplier = sc.nextInt();   // R

        // Booth's Algorithm implementation
        int M = multiplicand; // Multiplicand (M)
        int Q = multiplier;   // Multiplier (Q)
        int A = 0;            // Accumulator (A)
        int Q_1 = 0;          // Extra bit to the right of Q (initially 0)
        int n = 32;           // Number of bits (assuming 32-bit integers)

        // Combine A and Q into a single 64-bit value for shifting
        // A is the upper 32 bits, Q is the lower 32 bits
        long AQ = ((long) A << 32) | (Q & 0xFFFFFFFFL);

        // Iterate for the number of bits
        for (int i = 0; i < n; i++) 
        {
            // Get the least significant bit of Q and the extra bit Q_1
            int currentBit = (int) (AQ & 1); // Least significant bit of Q
            int bitPair = (currentBit << 1) | Q_1; // Form the bit pair: currentBit and Q_1

            // Extract A from the upper 32 bits of AQ
            A = (int) (AQ >> 32);

            // Perform operation based on the bit pair
            switch (bitPair) {
                case 0b01: // 01: Add M to A
                    A += M;
                    break;
                case 0b10: // 10: Subtract M from A
                    A -= M;
                    break;
                // Cases 00 and 11: Do nothing
            }

            // Update AQ with the new value of A
            AQ = ((long) A << 32) | (AQ & 0xFFFFFFFFL);

            // Store the bit that will be shifted out of Q (becomes Q_1)
            Q_1 = (int) (AQ & 1);

            // Arithmetic right shift of the entire AQ (A and Q together)
            AQ >>= 1;
        }

        // The final product is the 64-bit AQ (A and Q concatenated)
        long product = AQ;

        // Output the result
        System.out.println("Product: " + product);
        sc.close();
    }
}