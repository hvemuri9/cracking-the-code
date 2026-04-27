package com.algo.array.twopointer;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length != 0) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
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

    public static int countDistinctPairs(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int s = nums[left] + nums[right];
            int vl = nums[left];
            int vr = nums[right];
            if (s == target) {
                count++;
                left++;
                right--;
                while (left < right && nums[left] == vl) {
                    left++;
                }
                while (left < right && nums[right] == vr) {
                    right--;
                }
            } else if (s > target) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }


    public static int[] findClosetToTarget(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int lDiff = Integer.MAX_VALUE;
        int[] output = new int[]{-1, -1};
        while (left < right) {
            int s = nums[left] + nums[right];
            int diff = Math.abs(target - s);
            if (diff < lDiff) {
                lDiff = diff;
                output = new int[]{left, right};
            }
            if (s < target) {
                left++;
            } else if (s > target) {
                right--;
            } else {
                return output;
            }
        }
        return output;
    }
}
