package org.jugbd.marathon.day1;

public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {
        int max = 0;
        int currentMax = 0;

        for (int a : arr) {
            currentMax = Math.max(a, currentMax + a);
            max = Math.max(currentMax, max);
        }

        return max;
    }
}
