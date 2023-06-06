package practice_codes.amazon_interviewbit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TrappingRainWaterTest {
    @Test
    void bestCase() {
        Assertions.assertEquals(10, TrappingRainWater.callCalculateTappedWater(Arrays.asList(3, 0, 0, 2, 0, 4)));
        Assertions.assertEquals(10, TrappingRainWater.callCalculateTappedWater(Arrays.asList(7, 4, 0, 9)));
        Assertions.assertEquals(0, TrappingRainWater.callCalculateTappedWater(Arrays.asList(6, 9, 9)));
    }

    @Test
    void cornerCase() {
        Assertions.assertEquals(0, TrappingRainWater.callCalculateTappedWater(Arrays.asList(0, 0, 0, 0, 0)));
        Assertions.assertEquals(0, TrappingRainWater.callCalculateTappedWater(Arrays.asList(0)));
        Assertions.assertEquals(0, TrappingRainWater.callCalculateTappedWater(null));
    }

}