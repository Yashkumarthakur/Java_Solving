package practice_codes.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PrisonBreakProblemTest {

    @Test
    void bestCase(){
        Assertions.assertEquals(12,PrisonBreakProblem.callCalculateArea(3,2, Arrays.asList(1,2,3), Arrays.asList(1,2)));
        Assertions.assertEquals(4,PrisonBreakProblem.callCalculateArea(2,2, Arrays.asList(1), Arrays.asList(2)));
        Assertions.assertEquals(4,PrisonBreakProblem.callCalculateArea(3,3, Arrays.asList(2), Arrays.asList(2)));
    }

    @Test
    void cornerCase(){
        Assertions.assertEquals(0,PrisonBreakProblem.callCalculateArea(3,0, Arrays.asList(1,2,3), Arrays.asList(1,2)));
        Assertions.assertEquals(0,PrisonBreakProblem.callCalculateArea(0,2, Arrays.asList(1), Arrays.asList(2)));
        Assertions.assertEquals(0,PrisonBreakProblem.callCalculateArea(3,3, null, Arrays.asList(2)));
        Assertions.assertEquals(0,PrisonBreakProblem.callCalculateArea(3,3, Arrays.asList(2), null));
        Assertions.assertEquals(0,PrisonBreakProblem.callCalculateArea(3,3, null, null));
    }
}