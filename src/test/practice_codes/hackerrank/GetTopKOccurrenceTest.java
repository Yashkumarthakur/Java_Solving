package practice_codes.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetTopKOccurrenceTest {
    @Test
    void bestCase() {
        String input1 = "1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7";
        Assertions.assertArrayEquals(new int[]{1}, GetTopKOccurrence.callForGetTopKOccurrence(input1, 1));
        Assertions.assertArrayEquals(new int[]{1, 8}, GetTopKOccurrence.callForGetTopKOccurrence(input1, 2));
        Assertions.assertArrayEquals(new int[]{1, 8, 2}, GetTopKOccurrence.callForGetTopKOccurrence(input1, 3));
        Assertions.assertArrayEquals(new int[]{},GetTopKOccurrence.callForGetTopKOccurrence(input1,0));
    }

    @Test
    void cornerCase() {
        String input1 = "1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7";
        Assertions.assertArrayEquals(new int[]{1, 8, 2, 4, 6, 5, 9, 3, 7}, GetTopKOccurrence.callForGetTopKOccurrence(input1, 10));
        Assertions.assertArrayEquals(new int[]{}, GetTopKOccurrence.callForGetTopKOccurrence(null, 1));

        String input2 = "1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7 1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7";
        Assertions.assertArrayEquals(new int[]{1}, GetTopKOccurrence.callForGetTopKOccurrence(input2, 1));
        Assertions.assertArrayEquals(new int[]{1, 8, 2, 4, 6, 5, 9, 3, 7}, GetTopKOccurrence.callForGetTopKOccurrence(input2, 10));
    }

}