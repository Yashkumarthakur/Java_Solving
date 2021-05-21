package practice_codes.hackerrank;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathHomeworkTest {

	@Test
	void minMathHomeworkTest() {
		Assertions.assertEquals(3, MathHomework.callMinMathHomework(7, Arrays.asList(1, 2, 3, 5, 8)));
		Assertions.assertEquals(3, MathHomework.callMinMathHomework(4, Arrays.asList(1, 2, 3, 4, 5)));
		Assertions.assertEquals(2, MathHomework.callMinMathHomework(2, Arrays.asList(1, 2, 3)));
	}

	@Test
	void cornerCase() {
		Assertions.assertEquals(10,
				MathHomework.callMinMathHomework(650, Arrays.asList(82, 112, 134, 178, 206, 229, 238, 278, 293, 335)));
	}
}
