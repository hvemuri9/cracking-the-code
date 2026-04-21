package com.algo.binary;

import java.util.Arrays;

public class CountingBits {

    static void main() {
        System.out.println("Number of 1's for 2 is: " + Arrays.toString(countBits(2)));
        System.out.println("Number of 1's for 5 is: " + Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            res[i] = 1 + res[i - offset];
        }
        return res;
    }


}
