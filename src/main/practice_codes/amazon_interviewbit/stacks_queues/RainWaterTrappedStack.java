package practice_codes.amazon_interviewbit.stacks_queues;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Rain Water Trapped
 * Asked in:
 * Qualcomm
 * Amazon
 * Microsoft
 * Goldman Sachs
 * Problem Description
 *
 * Given an integer array A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 *
 *
 * Input Format
 * The only argument given is integer array A.
 *
 *
 *
 * Output Format
 * Return the total water it is able to trap after raining.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * Input 2:
 *
 *  A = [1, 2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  6
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
 *  In this case, 6 units of rain water (blue section) are being trapped.
 * Explanation 2:
 *
 *  No water is trapped.
 *
 *
 */
public class RainWaterTrappedStack {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
        callForRainWaterTrappedStack(input);
    }

    protected static int callForRainWaterTrappedStack(List<Integer> input) {
        System.out.println("Given input : " + input);
        int result = getRainWaterTrapped(input);
        System.out.println("Result :" + result);
        return result;

    }

    private static int getRainWaterTrapped(List<Integer> input) {

        Stack<Integer> stack = new Stack<>();
        int n = input.size();
        int result = 0;

        for (int i = 0; i < n; i++) {

            // Remove bars from the stack
            // until the condition holds
            while ((!stack.isEmpty()) && (input.get(stack.peek()) < input.get(i))) {

                // store the height of the top
                // and pop it.
                int popHeight = input.get(stack.peek());
                stack.pop();

                // If the stack does not have any
                // bars or the the popped bar
                // has no left boundary
                if (stack.isEmpty()) break;

                // Get the distance between the
                // left and right boundary of
                // popped bar
                int distance = i - stack.peek() - 1;

                // Calculate the min. height
                int minHeight = Math.min(input.get(stack.peek()), input.get(i)) - popHeight;
                result += distance * minHeight;
            }

            // If the stack is either empty or
            // height of the current bar is less than
            // or equal to the top bar of stack
            stack.push(i);
        }

        return result;
    }
}
