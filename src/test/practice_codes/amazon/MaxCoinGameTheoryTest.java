package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCoinGameTheoryTest {
    @Test
    void bestCase() {
        Assertions.assertEquals(701, MaxCoinGameTheory.callForGetMaxCoin(new int[]{1, 2, 700, 3}));
        Assertions.assertEquals(701, MaxCoinGameTheory.callForGetMaxCoin(new int[]{1, 2, 700, 300}));
        Assertions.assertEquals(2, MaxCoinGameTheory.callForGetMaxCoin(new int[]{1, 1, 1, 1}));
    }

    @Test
    void cornerCase() {
        Assertions.assertEquals(0, MaxCoinGameTheory.callForGetMaxCoin(new int[]{0, 0}));
        Assertions.assertEquals(100, MaxCoinGameTheory.callForGetMaxCoin(new int[]{100, 100}));
    }

}