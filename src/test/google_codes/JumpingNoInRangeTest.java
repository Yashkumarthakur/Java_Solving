package google_codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class JumpingNoInRangeTest {

    @Test
    void validTest() {
        int[] input = new int[]
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98, 101};
        Assertions.assertEquals(addInList(input),
                JumpingNoInRange.display(105));
        System.out.print("Result : " + Arrays.toString(input));
    }

    @Test
    void singleDigitVal() {
        int givenNo = 9;
        int[] input = new int[]
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(addInList(input), JumpingNoInRange.display(givenNo));
        System.out.print("Result : " + Arrays.toString(input));
    }

    private ArrayList<Integer> addInList(int[] input) {
        ArrayList<Integer> result = new ArrayList();
        for (int i : input)
            result.add(i);
        return result;
    }

}