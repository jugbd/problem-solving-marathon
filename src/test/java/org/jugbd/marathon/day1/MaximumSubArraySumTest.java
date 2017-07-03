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
    public void testExampleArray02() throws Exception {
        assertEquals("Example array should have a max of 9",
                9,
                MaximumSubArraySum.findMaxSum(new int[] {4, -2, 6, -10, 8, 1}));
    }
}
