import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MouseAndCheeseTest {
    @Test
    void baseCase() {
        Assertions.assertEquals(4, MouseAndCheese.findMaxCheese(Arrays.asList(1, 2, 3)));
        Assertions.assertEquals(113, MouseAndCheese.findMaxCheese(Arrays.asList(8, 5, 10, 100, 10, 5)));
        Assertions.assertEquals(17, MouseAndCheese.findMaxCheese(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 6, 1, 1, 1, 1)));
        Assertions.assertEquals(328, MouseAndCheese.findMaxCheese(Arrays.asList(8, 5, 10, 100, 10, 5, 8, 5, 10, 100, 10, 5, 8, 5, 10, 100)));
    }

}