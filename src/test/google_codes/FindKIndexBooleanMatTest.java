package google_codes;

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

}
