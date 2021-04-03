package googlecodes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSumFormDigitOfArrayTest {

    @Test
    void bestCase() {
        Assertions.assertEquals(604, MinSumFormDigitOfArray.diaplay(new int[]{6, 8, 4, 5, 2, 3}));
        Assertions.assertEquals(82, MinSumFormDigitOfArray.diaplay(new int[]{5, 3, 0, 7, 4}));
        Assertions.assertEquals(3, MinSumFormDigitOfArray.diaplay(new int[]{1,2}));
    }

    @Test
    void negativeCase(){
        Assertions.assertEquals(0, MinSumFormDigitOfArray.diaplay(new int[]{}));
        Assertions.assertEquals(0, MinSumFormDigitOfArray.diaplay(new int[]{0}));
    }
}