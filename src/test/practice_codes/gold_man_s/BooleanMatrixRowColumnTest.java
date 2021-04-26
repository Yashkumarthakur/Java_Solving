package practice_codes.gold_man_s;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BooleanMatrixRowColumnTest {

    @Test
    void sampleInputFor4() {
        int[][] mat = {{1, 0, 0, 0},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(0, BooleanMatrixRowColumn.display(mat));
    }

    @Test
    void sampleInputFor4Index1() {
        int[][] mat = {{1, 1, 0, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(1, BooleanMatrixRowColumn.display(mat));
    }

    @Test
    void sampleInputFor4Index1UnEven() {
        int[][] mat = {{1, 1, 1, 0},
                {0, 1, 1, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 0}};
        Assertions.assertEquals(2, BooleanMatrixRowColumn.display(mat));
    }

    @Test
    void sampleInputFor4Index1UnEven2() {
        int[][] mat =
                {{1, 1, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 1, 1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1}};
        Assertions.assertEquals(3, BooleanMatrixRowColumn.display(mat));
    }

    @Test
    void sampleInputFor4Index1UnEvenNegative() {
        int[][] mat =
                {{1, 1, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 1, 1, 0, 0, 1},
                        {0, 1, 0, 1},
                        {1, 1, 1, 1}};
        Assertions.assertEquals(-1, BooleanMatrixRowColumn.display(mat));
    }

}