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

                    if (tempSum > maxSum) {

                        maxSum = tempSum;
                    }
                }
            }

            if (maxSum > 0) {

                return maxSum;
            }

            return 0;
        }
    }
}
