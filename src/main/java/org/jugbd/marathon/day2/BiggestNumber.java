package org.jugbd.marathon.day2;

public class BiggestNumber {
	public static long findTheNextBiggerNumber(long n) {

		char[] digits = String.valueOf(n).toCharArray();
		if (digits.length == 1)
			return -1;
		for (int i = digits.length - 2; i >= 0; i--) {
			int index = getImmediateMaxDigitAsIndex(digits, i + 1, digits.length, digits[i]);
			if (index != -1) {
				char ch = digits[index];
				for (int j = index - 1; j >= i; j--) {
					digits[j + 1] = digits[j];
				}
				digits[i] = ch;
				return Long.parseLong(new String(digits));
			}
		}
		return -1;
	}

	static int getImmediateMaxDigitAsIndex(char[] digits, int startInd, int endInd, char givenDigit) {
		int index = -1;
		char min = '9';
		for (int i = startInd; i < endInd; i++) {
			if (digits[i] > givenDigit && min > digits[i]) {
				index = i;
				min = digits[i];
			}
		}
		return index;
	}
}
