package com.algo.sw.fixed;

public class MaxSubArraySum {


    public static int maxSum(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int left = 1;
        int right = left + (k - 1);
        int lSum = sum;
        while (left < right && right < nums.length) {
            lSum = lSum - nums[left - 1] + nums[right];
            sum = Math.max(sum, lSum);
            left++;
            right++;
        }
        return sum;
    }

}
