package org.jugbd.marathon.day2;


public class BiggestNumber {
    public static long findTheNextBiggerNumber(long n) {
        //write your awesome code here

        StringBuilder originalNumStr = new StringBuilder(String.valueOf(n));
        int numOfDigits = originalNumStr.length();
        return finderHelper(n, n, 1, numOfDigits);
    }
    private static long finderHelper(long originalNumber, long currentNumber, int index, int numOfDigits) {
        if (currentNumber / 10 != 0) {
            long swappedNumber;
            swappedNumber = swap(originalNumber, numOfDigits - index, numOfDigits - index - 1);
            if (swappedNumber > originalNumber) {
                return swappedNumber;
            }
            return finderHelper(originalNumber, currentNumber / 10, index + 1, numOfDigits);
        } else {
            return -1;
        }
    }

    private static long swap(long number, int firstIndex, int secondIndex) {
        StringBuilder numberStr = new StringBuilder(String.valueOf(number));
        char temp;
        temp = numberStr.charAt(firstIndex);
        numberStr.setCharAt(firstIndex, numberStr.charAt(secondIndex));
        numberStr.setCharAt(secondIndex, temp);
        return Long.valueOf(numberStr.toString());
    }
}
