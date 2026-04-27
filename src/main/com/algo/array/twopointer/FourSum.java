package com.algo.array.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int r = nums.length - 1;

                while (l < r) {

                    int s = nums[i] + nums[j] + nums[l] + nums[r];
                    if (s == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);

                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;

                    } else if (s < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
