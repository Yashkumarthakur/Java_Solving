package google_codes;

import google_codes.FindSortSubArrayIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindSortSubArrayIndexTest {

    @Test
    void TestBestCase(){
        Assertions.assertEquals(2,
                FindSortSubArrayIndex.display(new int[]{1, 2, 6, 5, 4, 8, 9}).length);

        Assertions.assertArrayEquals(new int[]{2, 4},
                FindSortSubArrayIndex.display(new int[]{1, 2, 6, 5, 4, 8, 9}));
    }

    @Test
    void invalidCase(){
        Assertions.assertArrayEquals( new int[]{0}, FindSortSubArrayIndex.display(new int[]{}));
        Assertions.assertArrayEquals( new int[]{2, 4}, FindSortSubArrayIndex.display(new int[]{1, 2, 6, 5, 4}));
        Assertions.assertArrayEquals( new int[]{1, 4}, FindSortSubArrayIndex.display(new int[]{1, 7, 6, 5, 4}));
    }

}