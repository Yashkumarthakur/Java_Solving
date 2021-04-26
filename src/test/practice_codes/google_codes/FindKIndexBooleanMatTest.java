package practice_codes.google_codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindKIndexBooleanMatTest {

    @Test
    void testKthValue() {
        Assertions.assertEquals(
                0, FindKIndexBooleanMat.findK(new int[][]{ {1, 0, 0, 0},
                    {1, 1, 1, 0},
                    {1, 1, 0, 0},
                    {1, 1, 1, 0}}));
        Assertions.assertEquals(
                1, FindKIndexBooleanMat.findK(new int[][]{{0, 1, 1, 0, 1},
                    {0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0},
                    {1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1}}));
        Assertions.assertEquals(
                -1, FindKIndexBooleanMat.findK(new int[][]{{0, 1, 1, 0, 1},
                    {0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0},
                    {1, 0, 1, 1, 0},
                    {1, 1, 1, 1, 1}}));
    }
    
    @Test
    void sampleInputFor4() {
        int[][] mat = {{1, 1, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(1, FindKIndexBooleanMat.findK(mat));
    }

    @Test
    void sampleInputFor4Index1() {
        int[][] mat = {{1, 1, 0, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(1, FindKIndexBooleanMat.findK(mat));
    }

    @Test
    void sampleInputFor4Index1UnEven() {
        int[][] mat = {{1, 1, 1, 0},
                {0, 1, 1, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(2, FindKIndexBooleanMat.findK(mat));
    }

    @Test
    void sampleInputFor4Index1UnEven2() {
        int[][] mat =
                {{1, 1, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 1, 1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1}};
        Assertions.assertEquals(3, FindKIndexBooleanMat.findK(mat));
    }

    @Test
    void sampleInputFor4Index1UnEvenNegative() {
        int[][] mat =
                {{1, 1, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 1, 1, 0, 0, 1},
                        {0, 1, 0, 1},
                        {1, 1, 1, 1}};
        Assertions.assertEquals(-1, FindKIndexBooleanMat.findK(mat));
    }

}
