package com.algo.array.slidingwindow.fixed;

public class MaxXOR {

    /**
     * Naive approach: Naive subarray XOR Scan
     *
     * @param nums
     * @param k
     * @return
     */
    public static int naiveXOR(int[] nums, int k) {
        int maxXOR = Integer.MIN_VALUE;
        int left = 0;
        int right = k - 1;

        while (left < right && right < nums.length) {
            int currentXOR = 0;
            for (int i = left; i <= right; i++) {
                currentXOR ^= nums[i];
            }
            maxXOR = Math.max(maxXOR, currentXOR);
            left++;
            right++;
        }
        return maxXOR;
    }

    public static int bestXOR(int[] nums, int k) {

        int currentXOR = 0;

        for (int i = 0; i < k; i++) {
            currentXOR ^= nums[i];
        }

        int maxXOR = currentXOR;

        for (int i = k; i < nums.length; i++) {
            //adding
            currentXOR ^= nums[i];

            //deleting
            currentXOR ^= nums[i - k];

            maxXOR = Math.max(maxXOR, currentXOR);
        }

        return maxXOR;
    }


}
