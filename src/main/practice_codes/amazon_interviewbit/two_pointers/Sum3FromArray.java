package practice_codes.amazon_interviewbit.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

/**
 * 3 Sum
 * Asked in:
 * Facebook
 * Amazon
 * Microsoft
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 *
 * Assume that there will only be one solution
 *
 * Example:
 * given array S = {-1 2 1 -4},
 * and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 *
 *
 */
public class Sum3FromArray {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 2, 1, -4));
        int target = 1;
        callForthreeSumClosest(input, target);

    }

    protected static int callForthreeSumClosest(ArrayList<Integer> input, int target) {
        out.println("Given no are : " + input);
        int result = threeSumClosest(input, target);
        out.println("Result is : " + result);
        return result;
    }

    private static int threeSumClosest(ArrayList<Integer> numbs, int target) {
        Collections.sort(numbs);
        int curr = 0;
        int ans = Integer.MIN_VALUE;
        int numbsSize = numbs.size();

        for (int i = 0; i < numbsSize; i++) {
            int j = i + 1;
            int k = numbsSize - 1;
            while (j < k) {
                curr = numbs.get(i) + numbs.get(j) + numbs.get(k);
                if (curr == target) return target;
                if (curr < target)
                    j++;
                else
                    k--;

                if (Math.abs(target - curr) < Math.abs(target - ans) || ans == Integer.MIN_VALUE) {
                    ans = curr;
                }
            }
        }
        return ans;
    }
}
