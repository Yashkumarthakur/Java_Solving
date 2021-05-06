package practice_codes.hackerrank;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockProfitTest {

	@Test
    void ifProfitZero(){
        
        ArrayList<Integer> currentValue = new ArrayList<Integer>();
        currentValue.add(150);
        currentValue.add(199);
        currentValue.add(200);
        currentValue.add(168);
        currentValue.add(153);

        ArrayList<Integer> futureValue = new ArrayList<Integer>();
        futureValue.add(140);
        futureValue.add(175);
        futureValue.add(199);
        futureValue.add(121);
        futureValue.add(111);
        
        Assertions.assertEquals( 0, StockProfit.findProfit(500, currentValue, futureValue));
    }
	
	@Test
    void ifProfitNonZero(){
        
        ArrayList<Integer> currentValue = new ArrayList<Integer>();
        currentValue.add(1);
        currentValue.add(2);
        currentValue.add(4);
        currentValue.add(6);

        ArrayList<Integer> futureValue = new ArrayList<Integer>();
        futureValue.add(5);
        futureValue.add(3);
        futureValue.add(5);
        futureValue.add(6);

        Assertions.assertEquals( 6, StockProfit.findProfit(30, currentValue, futureValue));
    }
	
}
