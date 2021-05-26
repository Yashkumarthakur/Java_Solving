package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMissingNoTest {
    @Test
    void bestCase(){
        Assertions.assertArrayEquals(new int[]{3, 2},FindMissingNo.callForFindMissingNo(new int[]{1,3,3}));
        Assertions.assertArrayEquals(new int[]{1,5},FindMissingNo.callForFindMissingNo(new int[]{4, 3, 6, 2, 1, 1}));
        Assertions.assertArrayEquals(new int[]{6, 5},FindMissingNo.callForFindMissingNo(new int[]{4, 3, 6, 2, 1, 6, 7}));
    }

    @Test
    void cornerCase(){
        Assertions.assertArrayEquals(new int[]{0,0},FindMissingNo.callForFindMissingNo(new int[]{1}));
        Assertions.assertArrayEquals(new int[]{0,0},FindMissingNo.callForFindMissingNo(new int[]{}));
        Assertions.assertArrayEquals(new int[]{0,0},FindMissingNo.callForFindMissingNo(null));
    }

}