package org.jugbd.marathon.day3;


public class TrappingTheRainWater {
	static int findWaterUnit(int[] arr) {

		int unitOfWater = 0, i, j, k;
		boolean checked[] = new boolean[arr.length];

		for(i=0;i<arr.length;i++) {

			checked[i] = false;
		}

		for(i=0;i<arr.length;i++) {

			if(checked[i] == false) { 

				for(j=i+1;j<arr.length;j++) {

					if(arr[i] <= arr[j] && checked[j] == false) {

						for(k=i+1;k<j;k++) {

							unitOfWater += (arr[i]-arr[k]);
							checked[k] = true;
						}
						break;
					}
				}
			} 
		}
		return unitOfWater;
	}
}
