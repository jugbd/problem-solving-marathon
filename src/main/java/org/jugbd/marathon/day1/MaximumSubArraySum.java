package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

                int max=0;
		int curr_max=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++){
			
			
			curr_max=Math.max(arr[i], curr_max+arr[i]);
			max=Math.max(curr_max, max);
			
		}
		
		
		return max;
    }
}
