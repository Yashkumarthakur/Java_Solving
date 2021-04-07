package google_codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ShirftMatrixElementByKTest {

    @Test
    void bestCase3() {
        int shift = 2;
        int[][] matrix = new int[][]
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        Assertions.assertArrayEquals(
                new int[][]{{3, 1, 2}, {6, 4, 5}, {9, 7, 8}}, ShirftMatrixElementByK.display(shift, matrix));
    }

    @Test
    void bestCase4() {
        int shift = 2;
        int[][] matrix = new int[][]
                {{1, 2, 3, 4},
                        {4, 5, 6, 7},
                        {7, 8, 9, 10}};
        System.out.println(Arrays.deepToString(ShirftMatrixElementByK.display(shift, matrix)));
        Assertions.assertArrayEquals(
                new int[][]{{3, 4, 1, 2}, {6, 7, 4, 5}, {9, 10, 7, 8}}, ShirftMatrixElementByK.display(shift, matrix));
    }

    @Test
    void testCode() {
        int shift = 10;
        int[][] matrix = new int[][]
                {{1, 2, 3, 4},
                        {4, 5, 6, 7},
                        {7, 8, 9, 10}};
        String result = Arrays.deepToString(ShirftMatrixElementByK.display(shift, matrix));
        System.out.println("Result is : " + result);
        Assertions.assertNotEquals("", result);
    }

}