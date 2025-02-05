/**
 * Nibble Swap Program
 * 
 * This program reads an integer input from the user and swaps its nibbles (the 4-bit segments that make up an 8-bit byte).
 * A nibble swap involves swapping the leftmost 4 bits (the high nibble) with the rightmost 4 bits (the low nibble) of the number.
 * 
 * For example, if the input number is 100 (in decimal), its binary representation is:
 * 01100100. After swapping the nibbles, the result becomes 01000110, which is 70 in decimal.
 * 
 * The program works by:
 * 1. Extracting the right nibble using a mask (0x0F) and shifting it to the left by 4 bits.
 * 2. Extracting the left nibble using a mask (0xF0) and shifting it to the right by 4 bits.
 * 3. Combining the two swapped nibbles using the bitwise OR operation to form the final swapped value.
 * 
 * The user is prompted to input an integer, and the original and swapped values are displayed.
 * 
 * Example:
 * Input: 100
 * Output: Original number: 100, After swapping nibble: 70
 */

import java.util.*;
public class Nibble_swap 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int swap;
        swap = ((num & 0x0F)<<4|(num & 0xfF)>>4);
        System.out.printf("\nOriginal number:%d",num);
        System.out.printf("\nAfter swapping nibble:%d",swap);
    }    
}
