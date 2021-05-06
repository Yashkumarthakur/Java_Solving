package practice_codes.paytm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandiesTest {

    @Test
    void TestBestCase(){
        Assertions.assertArrayEquals(new int[]{1,2,3,1},Candies.distributeCandy(4,7));
        Assertions.assertArrayEquals(new int[]{3,2,3,4},Candies.distributeCandy(4,12));
        Assertions.assertArrayEquals(new int[]{3,3,3,4},Candies.distributeCandy(4,13));
    }

    @Test
    void TestCornerCase(){
        Assertions.assertArrayEquals(new int[]{1300},Candies.distributeCandy(1,1300));
        Assertions.assertArrayEquals(new int[]{1,0,0,0},Candies.distributeCandy(4,1));
    }
}