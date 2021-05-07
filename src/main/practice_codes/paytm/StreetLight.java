package practice_codes.paytm;

import java.util.Arrays;

import static java.lang.System.*;

/**
 * One of the streets in your city has a total of L street lights. Each light i covers the street from
 * Xi to Yi distance. Find the length of street covered with light.
 * Input Specification:
 * input1: L, denoting the number of street lights.
 * input2: An array of L* 2 elements. For each row i, (Xi, Yi) denote that the
 * street light i covers the distance from Xi to Yi.
 * Output Specification:
 * Your function should return the length of the street covered with light.
 * Example 1:
 * input1: 1,
 * input2: {{5,10 } }
 * Output: 5
 */
public class StreetLight {
    public static void main(String[] args) {
        int lightCount = 2;
        int[][] coverage = new int[][]{{5, 10}, {8, 12}};

        out.println("Total coverage is " + getResult(lightCount, coverage));
    }

    protected static int getResult(int lightCount, int[][] coverage) {
        out.println("The Street Lights are : " + lightCount + " & its coverage is : " + Arrays.deepToString(coverage));
        return getCoverage(lightCount, coverage);
    }

    private static int getCoverage(int lightCount, int[][] coverage) {
        if (validateData(lightCount, coverage))
            return 0;
        int completeCoverage = 0;
        int differance = 0;

        for (int i = 0; i < lightCount; i++) {
            completeCoverage += coverage[i][1] - coverage[i][0];
            if (i != lightCount - 1) {
                int first = coverage[i][1];
                int second = coverage[i + 1][0];
                differance += (first > second) ? (first - second) : 0;
            }
        }
        return completeCoverage - differance;
    }

    private static boolean validateData(int lightCount, int[][] coverage) {
        return lightCount != coverage.length && lightCount != Arrays.stream(coverage).count();
    }
}
