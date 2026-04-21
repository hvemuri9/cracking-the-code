package com.algo.binary;

import java.util.Arrays;

public class MissingNumber {

    static void main() {
        System.out.println("Missing number for nums [3,0,1] is: " + missingBitWise(new int[]{3, 0, 1}));
        System.out.println("Missing number for nums [0,1] is: " + missingBitWise(new int[]{0, 1}));

        System.out.println("Missing number for nums [3,0,1] is: " + missing(new int[]{3, 0, 1}));
        System.out.println("Missing number for nums [0,1] is: " + missing(new int[]{0, 1}));
    }

    private static int missingBitWise(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] ^ i) != 0) {
                return i;
            }
        }
        return nums.length;
    }

    private static int missing(int[] nums) {
        int sum = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += (i - nums[i]);
        }
        return sum;
    }
}
