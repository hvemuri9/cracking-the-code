package com.algo.array.twopointer;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int indexAtNonZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexAtNonZeroes] = nums[i];
                indexAtNonZeroes++;
            }
        }

        for (int i = indexAtNonZeroes; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
