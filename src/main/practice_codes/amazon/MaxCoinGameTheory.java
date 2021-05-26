package practice_codes.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCoinGameTheory {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 700, 3};
        callForGetMaxCoin(input);
        List<Integer> l1 = new ArrayList<>();
    }

    protected static int callForGetMaxCoin(int[] input) {
        int result = -1;
        System.out.println("Given array is :" + Arrays.toString(input));
        if (!validateInput(input)) {
            result = getMaxCoin(input, 0, input.length - 1);
        }
        System.out.println("Result is : " + result);
        return result;
    }

    private static int getMaxCoin(int[] input, int leftMost, int rightMost) {
        if (leftMost + 1 == rightMost) {
            return Math.max(input[leftMost], input[rightMost]);
        }
        return Math.max(input[leftMost] +
                        Math.min(getMaxCoin(input, leftMost + 2, rightMost),
                                getMaxCoin(input, leftMost + 1, rightMost - 1)),
                input[rightMost] +
                        Math.min(getMaxCoin(input, leftMost, rightMost - 2),
                                getMaxCoin(input, leftMost + 1, rightMost - 1)));
    }

    private static boolean validateInput(int[] input) {
        return input == null || input.length == 0;
    }
}
