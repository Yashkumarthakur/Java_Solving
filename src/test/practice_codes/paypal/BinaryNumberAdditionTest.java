package practice_codes.paypal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryNumberAdditionTest {

	@Test
	void testBinaryAddition() {
		Assertions.assertEquals("1000011", BinaryNumberAddition.addBinary("11010", "00101001"));
		Assertions.assertEquals("111101", BinaryNumberAddition.addBinary("110011", "1010"));
	}

}
