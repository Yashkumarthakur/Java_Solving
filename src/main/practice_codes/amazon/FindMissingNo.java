package practice_codes.amazon;

import java.util.*;

import static java.lang.System.*;

/**
 * Given an unsorted array which contains unique numbers from 0 to 999 and size of array is 1000.
 * At one of the index the element has been replaced by some other element.
 * I need to find the original element.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {3, 1, 3}
 * Output: Missing = 2, Repeating = 3
 * Explanation: In the array,
 * 2 is missing and 3 occurs twice
 * <p>
 * Input: arr[] = {4, 3, 6, 2, 1, 1}
 * Output: Missing = 5, Repeating = 1
 * <p>
 * Space Complexity : O(n)
 * Time Complexity : O(1)
 */
public class FindMissingNo {
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 6, 2, 1, 6, 7};
        callForFindMissingNo(inputArray);
    }

    protected static int[] callForFindMissingNo(int[] inputArray) {
        out.println("Given array is : " + Arrays.toString(inputArray));
        int[] result = findMissingNo(inputArray);
        out.println("Repetitive No is : " + result[0]);
        out.println("Missing No is :" + result[1]);
        return result;
    }

    private static int[] findMissingNo(int[] inputArray) {
        int[] result = new int[2];
        if (validateInput(inputArray))
            return result;
        int arrayLength = inputArray.length;
        int sumOfNo = (arrayLength * (arrayLength + 1)) / 2;
        int sumOfSquareNo = (arrayLength * (arrayLength + 1) * (2 * arrayLength + 1)) / 6;
        int missingNumber;
        int repeatingNo;

        for (int j : inputArray) {
            sumOfNo -= j;
            sumOfSquareNo -= j * j;
        }

        missingNumber = (sumOfNo + sumOfSquareNo / sumOfNo) / 2;
        repeatingNo = missingNumber - sumOfNo;
        result[0] = repeatingNo;
        result[1] = missingNumber;
        return result;
    }

    private static boolean validateInput(int[] inputArray) {
        return inputArray == null || inputArray.length <= 1;
    }
}
