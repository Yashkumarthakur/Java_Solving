package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUniqueCombinationsTest {
    @Test
    void bestCase(){
        Assertions.assertEquals(6, StringUniqueCombinations.callForGetCombination("abc"));
        Assertions.assertEquals(2, StringUniqueCombinations.callForGetCombination("ab"));
        Assertions.assertEquals(12, StringUniqueCombinations.callForGetCombination("abcc"));
    }

    @Test
    void TimeComplexCase(){
        Assertions.assertEquals(181440, StringUniqueCombinations.callForGetCombination("abclasmdi"));
        Assertions.assertEquals(1, StringUniqueCombinations.callForGetCombination("aaaaaaaaaa"));
    }

    @Test
    void cornerCase(){
        Assertions.assertEquals(0, StringUniqueCombinations.callForGetCombination(""));
        Assertions.assertEquals(0, StringUniqueCombinations.callForGetCombination(null));
        Assertions.assertEquals(1, StringUniqueCombinations.callForGetCombination("a"));
    }

}