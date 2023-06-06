package practice_codes.amazon_interviewbit.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * Container With Most Water
 * Asked in:
 * Facebook
 * Google
 * Amazon
 * Adobe
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 *
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Your program should return an integer which corresponds to the maximum area of water that can be contained ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity ).
 *
 *  Note: You may not slant the container.
 * Example :
 *
 * Input : [1, 5, 4, 3]
 * Output : 6
 *
 * Explanation : 5 and 3 are distance 2 apart.
 * So size of the base = 2.
 * Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 *
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 4, 3));
        callForMaxArea(input);
    }

    protected static int callForMaxArea(ArrayList<Integer> input) {
        out.println("Given inputs : " + input);
        int result = maxArea(input);
        out.println("Result is : " + result);
        return result;
    }

    public static int maxArea(ArrayList<Integer> input) {
        int result = 0;
        if (input.isEmpty())
            return result;
        if (input.size() == 1)
            return result;
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 1; j < input.size(); j++) {
                int base = j - i;
                int minHeight = input.get(i) > input.get(j) ? input.get(j) : input.get(i);
                int newArea = base * minHeight;
                if (result < newArea)
                    result = newArea;
            }
        }
        return result;
    }

    public static int max(ArrayList<Integer> input) {
        if (input.size() < 2) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = input.size() - 1;

        while (i < j) {
            int minHeight = Math.min(input.get(i), input.get(j));
            ans = Math.max(ans, minHeight * (j - i));

            if (input.get(i) < input.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
