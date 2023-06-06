package practice_codes.amazon_interviewbit.bit_manipulation;

import static java.lang.System.out;

/**
 *
 * Reverse Bits
 * Asked in:
 * Nvidia
 * HCL
 * Amazon
 * Problem Description
 *
 * Reverse the bits of an 32 bit unsigned integer A.
 *
 * Problem Constraints
 * 0 <= A <= 232
 *
 * Input Format
 * First and only argument of input contains an integer A.
 *
 * Output Format
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 *
 * Example Input
 * Input 1:
 *  0
 * Example Output
 *   Output 1:
 *
 *    0
 *
 *
 *  Input 2:
 *  3
 *
 * Output 2:
 *
 *  3221225472
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *         00000000000000000000000000000000
 *
 * =>      00000000000000000000000000000000
 * Explanation 2:
 *
 *         00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 *
 *
 */

public class ReverseBitsLong {
    public static void main(String[] args) {
        long input = 3;
        callForReverseBit(input);

    }

    protected static void callForReverseBit(long input) {
        out.println("Given Input is : " + input);
        out.println("Result :" + reverse4(input));
    }

    public static long reverse4(long a) {
        long rev = 0;
        for (int i = 0; i < 32; i++, a >>= 1)
            rev = (rev << 1) | (a & 1);
        return rev;
    }
}
