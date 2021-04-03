package googlecodes;

//Shift matrix element row wise by k

import java.util.Arrays;

public class ShirftMatrixElementByK {
    public static void main(String[] args) {

        int shift = 2;
        int[][] matrix = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println("Matrix shift by : " + shift);
        System.out.println("Matrix after shift : " + Arrays.deepToString(display(shift, matrix)));
    }

    public static int[][] display(int shift, int[][] matrix) {
        System.out.println("Given matrix : " + Arrays.deepToString(matrix));
        return shiftMatrix(shift, matrix);
    }

    private static int[][] shiftMatrix(int shift, int[][] matrix) {
        if (validateInput(shift, matrix))
            return new int[0][0];

        int height = matrix.length;
        int length = matrix[0].length;
        int[][] result = new int[height][length];

        if (shift > length)
            shift = shift % length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                result[i][calculatePosition(j, length, shift)] = matrix[i][j];
            }
        }
        return result;
    }

    private static int calculatePosition(int current, int len, int shif) {
        int newPlace = current - shif;
        if (newPlace < 0)
            return len - Math.abs(newPlace);
        return newPlace;
    }

    private static boolean validateInput(int shift, int[][] matrix) {
        return (shift <= 0 || matrix.length == 0);
    }
}
