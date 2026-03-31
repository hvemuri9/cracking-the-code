package com.algo.tp;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length != 0) {
            int left = 0;
            int right = nums.length - 1;

            while(left < right) {
                int s = nums[left] + nums[right];
                if (s == target) {
                    return new int[]{left + 1, right + 1};
                }

                if (s > target) {
                    --right;
                } else {
                    ++left;
                }
            }

            return new int[]{-1, -1};
        } else {
            return new int[]{-1, -1};
        }
    }



}
