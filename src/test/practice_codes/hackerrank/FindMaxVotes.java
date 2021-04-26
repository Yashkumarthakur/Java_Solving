package practice_codes.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxVotesTest {

	@Test
	void testMaxVotes() {
		ArrayList<String> inputVotes = new ArrayList<String>(Arrays.asList("Gulab-jamun", "Laddu", "Jalebi", "Barfi",
				"Laddu", "Gulab-jamun", "Gulab-jamun", "Jalebi", "Gajar-halwa", "Gajar-halwa", "Barfi", "Gajar-halwa"));
		Assertions.assertEquals("Gulab-jamun", FindMaxVotes.maxSweet(inputVotes));

	}

}
