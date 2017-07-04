package org.jugbd.marathon.day1;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/3/17.
 */
public class MaximumSubArraySum {

    public static int findMaxSum(int[] arr) {

        int max=0, v;
    	int length=arr.length;
    	int save[]=new int[arr.length];
    	
    	for(int i=0;i<length;i++) {
    		
    		save[i]=i>0?(save[i-1]+arr[i]):arr[i];
    	}
    //	-2 1 -3 4 -1 2 1 -5 4
    	for(int i=0;i<length;i++) {
    		
    		for(int j=i+1;j<length;j++) {
    				
    			v=i>0?(save[j]-save[i-1]):save[j];
    			max=Math.max(max, v);
    		}
    	}
        return max;
    }
}
