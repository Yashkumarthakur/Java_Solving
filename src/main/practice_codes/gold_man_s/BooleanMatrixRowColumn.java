package practice_codes.gold_man_s;

import java.util.Arrays;

/*
 *
 * Difficulty level : medium
 * Given a Boolean Matrix, find k such that all elements in k'th row are 0 and k'th column are 1. If no such exist then print -1.
 * Input : mat[n][n] = {{1, 0, 0, 0},
 *                      {1, 1, 1, 0},
 *                      {1, 1, 0, 0},
 *                      {1, 1, 1, 0}}
 *
 * NOTE : mat[0][0] can be any value.
 * Output: 0
 *
 * */
public class BooleanMatrixRowColumn {
    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0}};
        System.out.println("Result :" + display(mat));
    }

    /**
     * @param mat : Given Matrix.
     * @return : Result.
     */
    public static int display(int[][] mat) {
        System.out.println("Given matrix : " + Arrays.deepToString(mat));
        return findRowColumn(mat);
    }

    /**
     * @param mat : Given matrix
     * @return : Result
     */
    private static int findRowColumn(int[][] mat) {
        if (validateMatrix(mat))
            return -1;

        int columnLen = mat.length;

        for (int k = 0; k < columnLen; k++) {
            if (checkForRowColumn(k, mat)) {
                return k;
            }
        }
        return -1;
    }

    /**
     * @param k   : Selected index for search matrix[k][k].
     * @param mat : Given matrix.
     * @return : return result as index of matching 0' for row & 1's for column otherwise -1.
     */
    private static boolean checkForRowColumn(int k, int[][] mat) {
        int rowSize = mat[k].length;
        int colSize = mat.length;

        // For row
        for (int i = 1; i < rowSize; i++) {
            int temp = mat[k][getNextIndex(i, rowSize, k)];
            if (temp != 0)
                return false;
        }

        // For column
        for (int i = 1; i < colSize; i++) {
            int temp = mat[getNextIndex(i, colSize, k)][k];
            if (temp != 1)
                return false;
        }
        return true;
    }

    /**
     * @param index        : current index serach for.
     * @param rowOrColSize : Row or Column Size.
     * @param pivotPoint   : Select point for serach.
     * @return : Return next index.
     */
    private static int getNextIndex(int index, int rowOrColSize, int pivotPoint) {
        int nextPoint = index + pivotPoint;
        if (nextPoint > rowOrColSize || nextPoint == rowOrColSize) {
            return nextPoint - rowOrColSize;
        }
        return nextPoint;
    }

    /**
     * @param mat : Given matrix.
     * @return : return true if matrix has more that 2 row and column.
     */
    private static boolean validateMatrix(int[][] mat) {
        return (mat.length < 2 && mat[0].length < 2);
    }
}
