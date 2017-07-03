package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @author ashik
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

        if (arr.length == 0) {

            return 0;
        } else {

            int maxSum = 0;

            for (int i = 0; i < arr.length; i++) {

                int tempSum = 0;
                for (int j = i; j < arr.length; j++) {

                    tempSum += arr[j];

                    maxSum = tempSum > maxSum ? tempSum : maxSum;
                }
            }

            return maxSum > 0 ? maxSum : 0;
        }
    }
}
