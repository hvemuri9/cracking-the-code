package com.algo.array;

public class MaxSubArrayProduct {

    static void main() {
        System.out.println("Max product subarray for 2,3,-2,4 is: " + maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println("Max product subarray for -2, 0, -1 is: " + maxProduct(new int[]{-2, 0, -1}));
        System.out.println("Max product subarray for -2, 3, -4 is: " + maxProduct(new int[]{-2, 3, -4}));
    }

    public static int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;

        int curMax = 1;
        int curMin = 1;

        for (int n : nums) {
            int tempMax = Math.max(n * curMax, n * curMin);
            curMax = Math.max(tempMax, n);
            int tempMin = Math.min(n * curMax, n * curMin);
            curMin = Math.min(tempMin, n);
            res = Math.max(res, curMax);
        }
        return res;
    }


}
