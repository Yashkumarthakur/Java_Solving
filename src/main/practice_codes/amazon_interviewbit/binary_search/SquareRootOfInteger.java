package practice_codes.amazon_interviewbit.binary_search;


import static java.lang.System.*;

/**
 * Square Root of Integer
 * Asked in:
 * Facebook
 * Amazon
 * Microsoft
 * Given an integar A.
 *
 * Compute and return the square root of A.
 *
 * If A is not a perfect square, return floor(sqrt(A)).
 *
 * DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
 *
 *
 *
 * Input Format
 *
 * The first and only argument given is the integer A.
 * Output Format
 *
 * Return floor(sqrt(A))
 * Constraints
 *
 * 1 <= A <= 10^9
 * For Example
 *
 * Input 1:
 *     A = 11
 * Output 1:
 *     3
 *
 * Input 2:
 *     A = 9
 * Output 2:
 *     3
 *
 */
public class SquareRootOfInteger {
    public static int sqrt(int number) {
        if (number == 0)
            return number;
        double t;
        double squareroot = Math.abs(number / 2);
        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return (int) squareroot;
    }

    public static void main(String[] args) {
        int number = 16;
        int root;
        root = sqrt(number);
        out.println("Number : " + number);
        out.println("Square Root : " + root);
    }
}
