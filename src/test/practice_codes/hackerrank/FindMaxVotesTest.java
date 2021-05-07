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
		Assertions.assertTrue(FindMaxVotes.maxSweet(inputVotes).equalsIgnoreCase("Gajar-halwa"));

	}

    @Test
    void testVotes() {
        ArrayList<String> inputVotes = new ArrayList<String>(Arrays.asList("Gulab-jamun", "Laddu", "Jalebi", "Barfi",
                "Laddu", "Gulab-jamun", "Gulab-jamun", "Jalebi", "Gajar-halwa", "Gajar-halwa", "Barfi", "Gajar-halwa", "Gajar-halwa"));
        Assertions.assertTrue(FindMaxVotes.maxSweet(inputVotes).equalsIgnoreCase("Gajar-halwa"));

        ArrayList<String> inputVotes1 = new ArrayList<String>(Arrays.asList("Laddu","Laddu","Jalebi","Jalebi","jalebi","Laddu"));
        Assertions.assertTrue(FindMaxVotes.maxSweet(inputVotes1).equalsIgnoreCase("jalebi"));
    }

}
