package practice_codes.paytm;

import java.util.Arrays;
import java.util.Stack;

import static java.lang.System.*;

/**
 * Given an array, print the Next Greater Element (NGE) for every element.
 * The Next greater Element for an element x is the first greater element on the right side of x in array.
 * Elements for which no greater element exist, consider next greater element as -1.
 * The next greater elements should be printed in same order as input array.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = [4, 5, 2, 25}
 * Output : 5 25 25 -1
 * <p>
 * Input : arr[] = [4, 5, 2, 25, 10}
 * Output : 5 25 25 -1 -1
 */

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 99, 0, 2, 7, 15, 9, 8};
        out.println("Result is :" + Arrays.toString(getResult(arr)).replace(',', '\n'));
    }

    protected static String[] getResult(int[] arr) {
        out.println("Given array is : " + Arrays.toString(arr));
        return processArray(arr);
    }

    public static String[] processArray(int[] arr) {
        if (validateInput(arr))
            return new String[]{""};

        Stack<Integer> tempStack = new Stack<>();
        int arrLength = arr.length;
        int[] tempArray = new int[arrLength];
        String[] result = new String[arrLength];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!tempStack.empty()) {
                while (!tempStack.empty() && tempStack.peek() <= arr[i]) {
                    tempStack.pop();
                }
            }
            tempArray[i] = tempStack.empty() ? -1 : tempStack.peek();
            tempStack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] + " -> " + tempArray[i];
        }
        return result;
    }

    private static boolean validateInput(int[] arr) {
        return arr == null || arr.length <= 0;
    }
}
