package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @author ashik
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

        if (arr != null && arr.length != 0) {

            int maxSum = 0;

            for (int i = 0; i < arr.length; i++) {

                int tempSum = arr[i];
                for (int j = i + 1; j < arr.length; j++) {

                    tempSum += arr[j];

                    maxSum = ((tempSum > maxSum) ? tempSum : maxSum);
                }
            }

            return ((maxSum > 0) ? maxSum : 0);
        }

        return 0;
    }
}
