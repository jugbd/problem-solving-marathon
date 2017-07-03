package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySum {
    public static int findMaxSum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int maxAtPos, maxSoFar;
        maxAtPos = maxSoFar = arr[0];

        boolean allNeg = true;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > -1)
                allNeg = false;
            maxAtPos = Math.max(arr[i], arr[i] + maxAtPos);
            maxSoFar = Math.max(maxSoFar, maxAtPos);
        }

        return allNeg ? 0 : maxSoFar;
    }
}
