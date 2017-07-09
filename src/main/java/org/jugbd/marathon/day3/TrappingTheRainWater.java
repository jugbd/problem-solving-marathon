package org.jugbd.marathon.day3;

public class TrappingTheRainWater {
	static int findWaterUnit(int[] arr) {
		int unitOfWater = 0;
		int length = arr.length - 1;
		int i = 0;
		while (i < length) {
			if (arr[i] != 0) {
				int j = i + 1;
				int sum = 0;
				boolean canHold = true;
				while (arr[i] > arr[j]) {
					sum += arr[i] - arr[j];
					if (j == length) {
						canHold = false;
						break;
					}
					j++;
				}
				if (canHold) {
					unitOfWater += sum;
					i = j;
					continue;
				}
			}
			i++;
		}
		return unitOfWater;
	}
}
