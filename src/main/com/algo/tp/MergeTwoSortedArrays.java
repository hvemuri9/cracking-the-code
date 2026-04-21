package com.algo.tp;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void merge(int[] a, int[] b) {

        int ia = a.length - 1;
        int ib = 0;

        while (ia >= 0 && ib < b.length) {
            if (a[ia] > b[ib]) {
                int temp = a[ia];
                a[ia] = b[ib];
                b[ib] = temp;
                ib++;
                ia--;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
