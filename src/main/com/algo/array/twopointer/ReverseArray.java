package com.algo.array.twopointer;

import java.util.Arrays;

public class ReverseArray {


    public static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) return;
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
