package practice_codes.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockProfitTest {

    @Test
    void ifProfitZero() {
        ArrayList<Integer> currentValue = new ArrayList<>(Arrays.asList(150, 199, 200, 168, 153));
        ArrayList<Integer> futureValue = new ArrayList<>(Arrays.asList(140, 175, 199, 121, 111));
        Assertions.assertEquals(0, StockProfit.getResult(500, currentValue, futureValue));
    }

    @Test
    void ifProfitNonZero() {
        ArrayList<Integer> currentValue = new ArrayList<>(Arrays.asList(1, 2, 4, 6));
        ArrayList<Integer> futureValue = new ArrayList<>(Arrays.asList(5, 3, 5, 6));
        Assertions.assertEquals(6, StockProfit.getResult(30, currentValue, futureValue));
    }

}
