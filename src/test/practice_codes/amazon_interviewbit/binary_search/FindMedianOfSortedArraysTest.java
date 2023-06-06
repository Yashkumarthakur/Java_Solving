package practice_codes.amazon_interviewbit.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMedianOfSortedArraysTest {

    @Test
    void bestCase() {
        Assertions.assertEquals(2.5, FindMedianOfSortedArrays.getMedian(new int[]{1, 3}, new int[]{2, 4}));
        Assertions.assertEquals(1, FindMedianOfSortedArrays.getMedian(new int[]{1, 1}, new int[]{1, 1}));
        Assertions.assertEquals(4, FindMedianOfSortedArrays.getMedian(new int[]{1, 2, 3, 4, 5}, new int[]{4, 8, 10, 15}));
    }

    @Test
    void invalidCase() {
        Assertions.assertEquals(0.0, FindMedianOfSortedArrays.getMedian(new int[]{}, new int[]{}));
        Assertions.assertEquals(0.0, FindMedianOfSortedArrays.getMedian(new int[]{1, 2}, new int[]{}));
        Assertions.assertEquals(0.0, FindMedianOfSortedArrays.getMedian(new int[]{}, new int[]{1, 2}));
    }
}