package practice_codes.amazon_interviewbit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

/**
 * Given an array arr[] of N non-negative integers representing the height of blocks.
 * If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * arr[] = {7,4,0,9}
 * Output:
 * 10
 * Explanation:
 * Water trapped by above
 * block of height 4 is 3 units and above
 * block of height 0 is 7 units. So, the
 * total unit of water trapped is 10 units.
 * <p>
 * <p>
 * Time Complexity O(n)
 * Space Complexity O(1)
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        List<Integer> inputData = new ArrayList<>(Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
        callCalculateTappedWater(inputData);
    }

    protected static int callCalculateTappedWater(List<Integer> inputData) {
        out.println("Input Data : " + inputData);
        int result = calculateTappedWater(inputData);
        out.println("Total water tapped is : " + result);
        return result;
    }

    private static int calculateTappedWater(List<Integer> inputData) {
        int result = 0;
        if (validateInput(inputData))
            return result;
        int tempPiller = 0;
        boolean flag = false;
        int tempResult = 0;
        for (int i : inputData) {
            if (i > tempPiller) {
                tempPiller = i;
                result += tempResult;
                flag = true;
                tempResult = 0;
            }

            if (i < tempPiller && flag) {
                tempResult += (tempPiller - i);
            }
        }

        return result;
    }

    private static boolean validateInput(List<Integer> inputData) {
        return inputData == null || inputData.isEmpty();
    }
}
