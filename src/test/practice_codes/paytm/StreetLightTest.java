package practice_codes.paytm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreetLightTest {

    @Test
    void bestCase(){
        Assertions.assertEquals(7, StreetLight.getResult(2, new int[][]{{5,10},{8,12}}));
        Assertions.assertEquals(5, StreetLight.getResult(1, new int[][]{{5,10}}));
        Assertions.assertEquals(21, StreetLight.getResult(4, new int[][]{{0,10},{5,12},{10,20},{21,22}})); // (5+7+10+1) - (5+2)
    }

    @Test
    void inValidCase(){
        Assertions.assertEquals(0, StreetLight.getResult(1, new int[][]{{5,10},{8,12}}));
        Assertions.assertEquals(0, StreetLight.getResult(2, new int[][]{{5,10}}));
        Assertions.assertEquals(0, StreetLight.getResult(4, new int[][]{{0,0},{0,0},{0,0},{0,0}}));
    }
}