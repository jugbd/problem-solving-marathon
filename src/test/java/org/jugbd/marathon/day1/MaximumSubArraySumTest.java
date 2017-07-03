package org.jugbd.marathon.day1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySumTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaximumSubArraySum.findMaxSum(new int[]{}));
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6",
                6,
                MaximumSubArraySum.findMaxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testNullArray() throws Exception {
        assertEquals("Example array should have a max of 0", 0, MaximumSubArraySum.findMaxSum(null));
    }

    @Test
    public void testNegativeArray() throws Exception {
        assertEquals("Example array should have a max of 0", 0, MaximumSubArraySum.findMaxSum(new int[]{-1, -2, -2, -4, -5}));
    }

    @Test
    public void testZeroArray() throws Exception {
        assertEquals("Example array should have a max of 0", 0, MaximumSubArraySum.findMaxSum(new int[]{0, 0, 0}));
    }
}