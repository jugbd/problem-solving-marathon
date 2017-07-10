package org.jugbd.marathon.day3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingTheRainWaterTest {

    @Test
    public void basicTest() {
        assertEquals(2, TrappingTheRainWater.findWaterUnit(new int[]{2, 0, 2}));
        assertEquals(10, TrappingTheRainWater.findWaterUnit(new int[]{3, 0, 0, 2, 0, 4}));
        assertEquals(6, TrappingTheRainWater.findWaterUnit(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(0, TrappingTheRainWater.findWaterUnit(new int[]{0, 1, 0}));
        assertEquals(4, TrappingTheRainWater.findWaterUnit(new int[]{3, 4, 0, 5, 2, 3, 0, 0}));
    }
}