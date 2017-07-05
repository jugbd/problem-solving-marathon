package org.jugbd.marathon.day2;


public class BiggestNumber {
    static void swap(char[] array,int a,int b){
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	

	public static long findTheNextBiggerNumber(long n) {
       char[] parts = Long.toString(n).toCharArray();
       
       boolean isDescendingOrder = true;
       int i=0;
       
       for( i=parts.length-1;i>0;i--){
    	   if(parts[i]>parts[i-1]){
    		   
    		   isDescendingOrder = false;
    		   break;
    	   }
       }
       
       if(isDescendingOrder == true){
    	   return -1;
       }
       
       else{
    	   int digit = parts[i-1];
    	   int min = i;
    	   
    	   for(int j= i+1;j<parts.length;j++){
    		   if(parts[j]>digit && parts[j]<parts[min]){
    			   min = j;
    		   }
    	   }
    	   
    	   swap(parts, min, i-1);
    	   
    	   Arrays.sort(parts,i,parts.length);
    	   String out ="";
    	   for(int j=0;j<parts.length;j++){
    		   out += parts[j];
    	   }
    	   
    	   return Integer.parseInt(out);
       }
       
    }
}
