package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FloodFillUsingRecursionTest {
    @Test
    void bestCase() {
        int[][] inputArray = new int[][]{
                {1, 1, 2, 0, 1, 1, 1,},
                {1, 1, 2, 2, 2, 1, 0},
                {1, 2, 2, 2, 1, 1, 0},
                {1, 2, 2, 1, 1, 0, 0},
                {2, 2, 1, 1, 0, 0, 0},
                {0, 0, 1, 2, 2, 2, 0},
                {0, 0, 0, 2, 2, 0, 0}};

        Assertions.assertEquals(10, FloodFillUsingRecursion.callForFloodFill(inputArray, 4, 3, 6));
        Assertions.assertEquals(1, FloodFillUsingRecursion.callForFloodFill(inputArray, 8, 0, 3));
        Assertions.assertEquals(6, FloodFillUsingRecursion.callForFloodFill(inputArray, 9, 0, 0));
    }

    @Test
    void cornerCase() {
        int[][] inputArray = new int[][]{
                {1, 1, 2, 0, 1, 1, 1,},
                {1, 1, 2, 2, 2, 1, 0},
                {1, 2, 2, 2, 1, 1, 0},
                {1, 2, 2, 1, 1, 0, 0},
                {2, 2, 1, 1, 0, 0, 0},
                {0, 0, 1, 2, 2, 2, 0},
                {0, 0, 0, 2, 2, 0, 0}};

        Assertions.assertEquals(0, FloodFillUsingRecursion.callForFloodFill(null, 4, 3, 6));
        Assertions.assertEquals(0, FloodFillUsingRecursion.callForFloodFill(inputArray, 8, 10, 3));
        Assertions.assertEquals(0, FloodFillUsingRecursion.callForFloodFill(inputArray, 9, 0, 30));
    }


}