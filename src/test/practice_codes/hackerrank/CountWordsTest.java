package practice_codes.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWordsTest {

	@Test
    void normalString() {
        Assertions.assertEquals(4, CountWords.callCountWords("I like to dance"));
    }
	
	@Test
    void stringWithNumbers() {
        Assertions.assertEquals(7, CountWords.callCountWords("I like to dance in steps 123 and 456ABC"));
    }
	
	@Test
    void stringWithSpecialChar() {
        Assertions.assertEquals(4, CountWords.callCountWords("I like to dance @nd {in} "));
    }
	
	@Test
    void stringIsEmpty() {
        Assertions.assertEquals(0, CountWords.callCountWords(""));
        Assertions.assertEquals(0, CountWords.callCountWords(null));
    }
}
