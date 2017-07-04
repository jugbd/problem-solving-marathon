package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @author ashik
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

        int previousMax = 0, max = 0;

        for (int anArr : arr) {
            max += anArr;
            if (max < 0) {
                max = 0;
            } else if (max > previousMax) {
                previousMax = max;
            }
        }

        return previousMax;
    }
}
