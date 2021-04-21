package practice_codes.google_codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfHalfDiagonalsTest {

    @Test
    void sampleInputUsing4Valid() {
        int[][] matrix = {{2, 9, 1, 4, -2},
                {6, 7, 2, 11, 4},
                {4, 2, 9, 2, 4},
                {1, 9, 2, 4, 4},
                {0, 2, 4, 2, 5}};
        Assertions.assertEquals(SumOfHalfDiagonals.VALID_DIAGONAL, SumOfHalfDiagonals.display(matrix));
    }

    @Test
    void sampleInputUsing4InValid() {
        int[][] matrix = {{2, 9, 1, 4, -2},
                {6, 7, 2, 11, 4},
                {4, 2, 9, 2, 4},
                {1, 9, 2, 4, 4},
                {0, 2, 4, 2, 8}};
        Assertions.assertEquals(SumOfHalfDiagonals.NOT_DIAGONAL, SumOfHalfDiagonals.display(matrix));
    }

    @Test
    void sampleInputUsing3Valid() {
        int[][] matrix = {{2, 9, 2},
                {6, 2, 2},
                {2, 2, 2}};
        Assertions.assertEquals(SumOfHalfDiagonals.VALID_DIAGONAL, SumOfHalfDiagonals.display(matrix));
    }

    @Test
    void sampleInputUsing3InValid() {
        int[][] matrix = {{2, 9, 2},
                {6, 4, 2},
                {2, 2, 2}};
        Assertions.assertEquals(SumOfHalfDiagonals.NOT_DIAGONAL, SumOfHalfDiagonals.display(matrix));
    }

    @Test
    void sampleInputUsingInValid() {
        int[][] matrix = {{2, 9, 1, 4, -2},
                {6, 7, 2, 11, 4},
                {4, 2, 9, 2, 4},
                {1, 9, 2, 4, 4},
                {0, 2, 4}};
        Assertions.assertEquals(SumOfHalfDiagonals.NOT_VALID_MATRIX, SumOfHalfDiagonals.display(matrix));
    }

}