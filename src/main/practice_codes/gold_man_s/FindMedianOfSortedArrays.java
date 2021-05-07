package practice_codes.gold_man_s;

import java.util.Arrays;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * Find median from 2 sorted array.
 */
public class FindMedianOfSortedArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3};
        int[] array2 = new int[]{2, 4};

        out.println("Median is : " + getMedian(array1, array2));
    }

    protected static double getMedian(int[] array1, int[] array2) {
        out.println("Given sorted array1 : " + Arrays.toString(array1) + " and array2 : " + Arrays.toString(array2));
        return findMedian(array1, array2);
    }

    private static double findMedian(int[] array1, int[] array2) {
        if (validateInout(array1, array2))
            return 0.0d;
        int pointer1 = 0;
        int pointer2 = 0;
        int firstVal = 0;
        int secondVal = 0;
        int mid = round((array1.length + array2.length) / 2);
        boolean flag = mid % 2 == 0;
        if (flag)
            mid += 1;
        for (int i = 0; i < mid; i++) {
            if (pointer1 < array1.length && array1[pointer1] <= array2[pointer2]) {
                secondVal = firstVal;
                firstVal = array1[pointer1];
                pointer1++;
            } else {
                secondVal = firstVal;
                firstVal = array2[pointer2];
                pointer2++;
            }
        }
        return flag ? ((double) (firstVal + secondVal) / 2) : (double) secondVal;
    }

    private static boolean validateInout(int[] array1, int[] array2) {
        return array1.length == 0 || array2.length == 0;
    }
}
