package gold_man_s;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void validCase(){
        Assertions.assertEquals("5G11r1t",DecodeString.display("GGGGGrrrrrrrrrrrt"));
        Assertions.assertEquals("1G1g3G11r1t",DecodeString.display("GgGGGrrrrrrrrrrrt"));
        Assertions.assertEquals("",DecodeString.display(""));
    }

}