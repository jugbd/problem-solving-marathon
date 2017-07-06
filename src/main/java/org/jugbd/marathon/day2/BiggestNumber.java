package org.jugbd.marathon.day2;

public class BiggestNumber {
	public static long findTheNextBiggerNumber(long n) {

		int ar[]=new int[20]; // long is 64 bit, so max 19 digits can be possible
		int length=0;
		boolean found=false;
		while(n>0) {

			ar[length++]=(int) (n%10);
			n/=10;
		}

		for(int i=0;i<length;i++) {

			for(int j=i+1;j<length;j++) {

				if(ar[j] < ar[i]) {

					int tmp=ar[i];
					for(int k=i+1;k<=j;k++) {

						ar[k-1]=ar[k];
					}

					ar[j]=tmp;
					found=true;
					break;
				}
			}
			if(found)
				break;
		}

		n=0;
		for(int i=length-1;i>=0;i--) {

			n=n*10+ar[i];
		}

		return found?n:-1;
	}
}
