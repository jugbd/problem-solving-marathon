package org.jugbd.marathon.day1;



public class BiggestNumber {
	public static long findTheNextBiggerNumber(long n) {

         int length=String.valueOf(n).length();
		
		int[] y=new int[length];
		
		long temp=n;
		int i=0;
		while(temp>0){
			
			y[i]=(int) (temp%10);
			temp=temp/10;
			i++;
		}
		
		int[] arr=new int[length];
		for( int m=0,k=length-1;m<n && k>=0;m++,k--){
			
			arr[k]=y[m];
		}
		
		
		
		for(i=length-1;i>0;i--){
			
			if(arr[i]>arr[i-1]){
				break;
			}
		}
		
		if(i==0){
			return -1;
		}
		
		int smallest1=arr[i-1];
		int smallest2=arr[i];
		int smlIndex=i;
		
		for(int j=i+1;j<length;j++){
			if(arr[j]>smallest1 && arr[j]<smallest2){
				smallest2=arr[j];
				smlIndex=j;
				
			}
		}
		
		  
		
		 temp=smallest1;
		 arr[i-1]=smallest2;
		 arr[smlIndex]=(int) temp;
		 
		
		
		Arrays.sort(arr,i,length);
		
		
		 long ans=0;
		 for(i=0;i<length;i++){
			 ans=ans*10+arr[i];
		 }
		 
		 
		return ans;
	}
}
