package practice_codes.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelSubstringTest {

	@Test
    void checkSubstring(){
        Assertions.assertEquals( 1, VowelSubstring.findSubstring("aeoibddaeoiud"));
        Assertions.assertEquals( 2, VowelSubstring.findSubstring("aeoibsddaeiouudb"));
    }
	
}
