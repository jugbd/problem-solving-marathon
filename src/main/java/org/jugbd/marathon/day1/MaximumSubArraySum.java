package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySum {
  public static int findMaxSum(int[] arr) {
        if (arr.length==0)
            return 0;

        int max_sum = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current = current + arr[i];
            if (max_sum < current) max_sum = current;
            if (current < 0) current = 0;
        }
        return max_sum;
    }
}
