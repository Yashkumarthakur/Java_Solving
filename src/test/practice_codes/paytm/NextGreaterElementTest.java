package practice_codes.paytm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void bestCase() {
        String[] result = new String[]{"1 -> 3", "3 -> 5", "5 -> 99", "99 -> -1", "0 -> 2", "2 -> 7", "7 -> 15", "15 -> -1", "9 -> -1", "8 -> -1"};
        int[] input = {1, 3, 5, 99, 0, 2, 7, 15, 9, 8};
        Assertions.assertArrayEquals(result, NextGreaterElement.getResult(input));

        String[] result1 = new String[]{"1 -> -1", "1 -> -1", "1 -> -1"};
        int[] input1 = {1, 1, 1};
        Assertions.assertArrayEquals(result, NextGreaterElement.getResult(input1));
    }

    @Test
    void cornerCases(){
        Assertions.assertArrayEquals(new String[]{""}, NextGreaterElement.getResult(null));
        Assertions.assertArrayEquals(new String[]{""}, NextGreaterElement.getResult(new int[]{}));
    }

    @Test
    void worstCase(){
        int[] input = IntStream.rangeClosed(1, 10000).toArray();
        Assertions.assertNotNull(NextGreaterElement.getResult(input));
    }
}