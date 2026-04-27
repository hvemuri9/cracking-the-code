package com.algo.array.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> getDistinctList(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            //Avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int s = nums[i] + nums[l] + nums[r];
                if (s == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    //Avoid duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    //Avoid duplicates
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (s < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

    public static int closeToTarget(int[] nums) {
        if (nums == null || nums.length < 3) return Integer.MAX_VALUE;

        Arrays.sort(nums);

        int lastClose = Integer.MAX_VALUE;


        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];

                if (s < lastClose) {
                    lastClose = Math.abs(s);
                }
                if (s == 0) {
                    return 0;
                } else if (s < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return lastClose;
    }

}
