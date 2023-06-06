package practice_codes.amazon_interviewbit.two_pointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.*;

/**
 * Pair With Given Difference
 * Asked in:
 * Amazon
 * Flipkart
 * Problem Description
 *
 * Given an one-dimensional unsorted array A containing N integers.
 *
 * You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.
 *
 * Return 1 if any such pair exists else return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -103 <= A[i] <= 103
 * -105 <= B <= 105
 *
 *
 * Input Format
 * First argument is an integer array A of size N.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return 1 if any such pair exists else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [5, 10, 3, 2, 50, 80]   // 83, 88, 81, 80, 128, 158
 *  B = 78
 * Input 2:
 *
 *  A = [-10, 20]
 *  B = 30
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Pair (80, 2) gives a difference of 78.
 * Explanation 2:
 *
 *  Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30
 *
 */
public class PairWithGivenDifference {
    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 10, 3, 80, 50, 2));
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398));
        int difference = -42;
        callForPairWithGivenDifference(input,difference);
    }

    protected static boolean callForPairWithGivenDifference(ArrayList<Integer> input, int difference) {
        out.println("Given inputs : " + input);
        out.println("Difference is : " + difference);
        boolean isAvailable = isDifferenceAvailable(input,difference);
        out.println("Is available : " + isAvailable);
        return isAvailable;
    }

    private static boolean isDifferenceAvailable(ArrayList<Integer> input, int difference) {
        HashSet<Integer> temp =  new HashSet<>();
        int newDif = Math.abs(difference);
        for (Integer integer : input) {
            int diff = newDif >= integer ? newDif + integer : integer - newDif;
            if (temp.contains(integer))
                return true;
            temp.add(diff);
        }
        return false;
    }

    private static boolean isDifferenceAvailable1(ArrayList<Integer> input, int difference) {
        int newDif = Math.abs(difference);
        for (int i = 0 ; i < input.size()-1; i ++){
            int diff = newDif >= input.get(i) ? newDif + input.get(i) :  input.get(i) - newDif;
            for (int j = i+1; j < input.size(); j++){
                if (input.get(j).equals(diff))
                    return true;
            }
        }
        return false;
    }

}
