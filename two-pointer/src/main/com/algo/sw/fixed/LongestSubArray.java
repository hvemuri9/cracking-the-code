package com.algo.sw.fixed;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {


    public static int findLength(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            counts.put(nums[right], counts.getOrDefault(nums[right], 0) + 1);
            // Shrink the window until we only have 2 distinct numbers
            while (counts.size() > 2) {
                counts.put(nums[left], counts.get(nums[left]) - 1);
                if (counts.get(nums[left]) == 0) {
                    counts.remove(nums[left]);
                }
                left++;
            }
            // Update max length (right - left + 1 is the window size)
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
