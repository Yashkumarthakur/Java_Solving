package practice_codes.amazon_interviewbit.arrays;

import static java.lang.System.*;

public class PascalTriangle {
    // Java program for Pascal's Triangle
// A O(n^2) time and O(1) extra
// space method for Pascal's Triangle
    //Pascal function
    public static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {

            int print = 1;// used to represent print(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                out.print(print + " ");
                print = print * (line - i) / i;
            }
            out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}