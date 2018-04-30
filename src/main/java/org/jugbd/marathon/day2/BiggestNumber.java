package org.jugbd.marathon.day2;

import java.util.Arrays;

public class BiggestNumber {
    public static long findTheNextBiggerNumber(long n) {

        int ar[] = new int[20]; // long is 64 bit, so max 19 digits can be possible
        int length = 0, tmp;
        boolean found = false;
        while (n != 0) {

            ar[length++] = (int) (n % 10);
            n /= 10;
        }

        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            tmp = ar[i];
            ar[i] = ar[j];
            ar[j] = tmp;
        }

        // 52876

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (ar[j] < ar[i]) {

                    tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                    Arrays.sort(ar, j + 1, length);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        n = 0;
        for (int i = 0; i < length; i++) {
            n = n * 10 + ar[i];
        }

        return found ? n : -1;
    }
}
