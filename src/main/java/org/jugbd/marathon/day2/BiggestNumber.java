package org.jugbd.marathon.day2;



public class BiggestNumber{

    static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static int[] GetDigit(long n) {
        int[] data = new int[String.valueOf(n).length()];
        int index = data.length - 1;
        while (n > 0) {
            data[index--] = (int) (n % 10);
            n = n / 10;
        }
        return data;
    }

    static long findTheNextBiggerNumber(long n) {
        int[] ar = GetDigit(n);
        int i;
        int len = ar.length;
        if (len == 1) {
            return 1;
        }

        for (i = len - 1; i > 0; i--) {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            return -1;
        } else {
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < len; j++) {
                if (ar[j] > x && ar[j] < ar[min]) {
                    min = j;
                    break;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, len);
            return formNumber(ar);
        }

    }

    private static int formNumber(int[] value) {
        int digit = 0;
        for (int i = 0; i < value.length; i++) {
            digit = digit * 10 + value[i];
        }
        System.out.println(digit);
        return digit;
    }
}
