package practice_codes.gold_man_s;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class ArrayMinusOpTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void displaySize() {
        Assertions.assertEquals(3,ArrayMinusOp.display(new int[]{3, 5, 2, 7, 4, 2, 7}, new int[] {1, 7, 5, 2, 2, 9}).size());
    }

    @Test
    void checkElement(){
        Assertions.assertEquals(Stream.of(3, 4, 7).collect(Collectors.toList()),
                ArrayMinusOp.display(new int[]{3, 5, 2, 7, 4, 2, 7}, new int[] {1, 7, 5, 2, 2, 9}));
    }
}