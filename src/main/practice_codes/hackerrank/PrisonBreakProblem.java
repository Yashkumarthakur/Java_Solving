package practice_codes.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

/**
 * Prison Break
 * A prisoner is planning to escape from prison!
 * The prison's gate consists of horizontal and vertical bars that are spaced one unit apart,
 * so the area of each hole between the bars is 1 x 1.
 * The prisoner manages to remove certain bars to make some: bigger holes.
 * Determine the area of the largest hole in the gate after the bars are removed.
 * <p>
 * <p>
 * Example:
 * n = 3
 * m = 3
 * h[] size x = 1
 * h = [2]
 * 3
 * 1212
 * 2
 * Explanation 0
 * There are n = m = 3 bars in the vertical and horizontal directions.
 * Bars to remove are h = [2] and v= [2] so the gate looks like this:
 * 1
 * 3
 * 1
 * 2
 * v[] size y = 1
 * v = [2]
 * Sample Output  4
 * <p>
 * Time Complexity : O(n+m)
 * Space Complexity : O(n+m)
 */

public class PrisonBreakProblem {
    public static void main(String[] args) {
        int vlines = 3;
        int hLines = 2;
        List<Integer> vLineCuts = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> hLineCuts = new ArrayList<>(Arrays.asList(1, 2));

        callCalculateArea(vlines, hLines, vLineCuts, hLineCuts);

    }

    protected static int callCalculateArea(int vlines, int hLines, List<Integer> vLineCuts, List<Integer> hLineCuts) {
        out.println("Given Data :");
        out.println("No. of vertical lines :" + vlines);
        out.println("No. of horizontal lines :" + hLines);
        out.println("Vertical line cuts :" + vLineCuts);
        out.println("Horizontal line cutes:" + hLineCuts);

        int result = calculateArea(vlines, hLines, vLineCuts, hLineCuts);
        out.println("Area is :" + result);
        return result;
    }

    private static int calculateArea(int vlines, int hLines, List<Integer> vLineCuts, List<Integer> hLineCuts) {
        if (validateInput(vlines, hLines, vLineCuts, hLineCuts))
            return 0;
        boolean[] vBooleanMat = new boolean[vlines + 1];
        boolean[] hBooleanMat = new boolean[hLines + 1];
        Arrays.fill(vBooleanMat, true);
        Arrays.fill(hBooleanMat, true);

        for (int i : vLineCuts) {
            vBooleanMat[i] = false;
        }
        for (int i : hLineCuts) {
            hBooleanMat[i] = false;
        }
        int count = 0;
        int vMax = 0;
        for (boolean b : vBooleanMat) {
            if (b) {
                count = 0;
            } else {
                count++;
                vMax = Math.max(count, vMax);
            }
        }

        int hMax = 0;
        count = 0;
        for (boolean b : hBooleanMat) {
            if (b) {
                count = 0;
            } else {
                count++;
                hMax = Math.max(count, hMax);
            }
        }
        return (vMax + 1) * (hMax + 1);
    }

    private static boolean validateInput(int vLines, int hLines, List<Integer> vLineCuts, List<Integer> hLineCuts) {
        return vLines == 0 || hLines == 0 || (vLineCuts == null || vLineCuts.isEmpty()) || (hLineCuts == null || hLineCuts.isEmpty());
    }
}
