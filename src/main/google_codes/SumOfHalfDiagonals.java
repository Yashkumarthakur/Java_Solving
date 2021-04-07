package google_codes;

/* (H)
 * Find if center element of matrix  is equal to sum of half diagonals  or not.
 *  Input : matrix[][] = {{2, 9, 1, 4, -2},
 *                        {6, 7, 2, 11, 4},
 *                        {4, 2, 9, 2, 4},
 *                        {1, 9, 2, 4, 4},
 *                        {0, 2, 4, 2, 5}}
 *
 * Output : YES
 *
 * Explanation : Center of matrix is 9
 *               1st half = 2 + 7 is 9
 *               2st half = 11 + -2 is 9
 *               3st half = 9 + 0 is 9
 *               4st half = 4 + 5 is 9
 *
 *
 *
 * */

import java.util.Arrays;

public class SumOfHalfDiagonals {
    public static final String VALID_DIAGONAL = "Given Matrix's half Diagonal sum is equal to center of matrix";
    public static final String NOT_DIAGONAL = "Given Matrix's half Diagonal sum is Not equal to center of matrix";
    public static final String NOT_VALID_MATRIX = "Given Matrix is Not Valid";

    public static void main(String[] args) {
        int[][] matrix = {{2, 9, 1, 4, -2},
                {6, 7, 2, 11, 4},
                {4, 2, 9, 2, 4},
                {1, 9, 2, 4, 4},
                {0, 2, 4, 2, 5}};


        System.out.println("Result : " + display(matrix));
    }

    public static String display(int[][] matrix) {
        System.out.println("Given matrix : " + Arrays.deepToString(matrix));
        return findDiagonal(matrix);
    }

    private static String findDiagonal(int[][] matrix) {
        if (validateMatrix(matrix))
            return NOT_VALID_MATRIX;

        if (getHalfSum(matrix, 1) &&
                getHalfSum(matrix, 2) &&
                getHalfSum(matrix, 3) &&
                getHalfSum(matrix, 4))
            return VALID_DIAGONAL;
        return NOT_DIAGONAL;
    }

    private static boolean getHalfSum(int[][] matrix, int quadrant) {
        int fetchNo = matrix.length / 2;
        int sum = 0;
        int center = 0;

        if (matrix.length / 2 == 0)
            center = matrix[fetchNo - 1][fetchNo - 1];
        else
            center = matrix[fetchNo][fetchNo];

        for (int i = 0; i < fetchNo; i++) {
            if (quadrant == 1)
                sum += matrix[i][i];
            else if (quadrant == 2)
                sum += matrix[i][matrix.length - 1 - i];
            else if (quadrant == 3)
                sum += matrix[matrix.length - 1 - i][matrix.length - 1 - i];
            else if (quadrant == 4)
                sum += matrix[matrix.length - 1 - i][i];
        }
        return (center == sum);
    }

    private static boolean validateMatrix(int[][] mat) {
        int len = mat.length;
        int total = mat[0].length;
        boolean flag = false;
        for (int i = 1; i < len; i++) {
            if (total != mat[i].length) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
