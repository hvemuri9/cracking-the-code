package com.algo.array.slidingwindow.fixed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinct {

    public static List<Integer> count(int nums[], int k) {
        List<Integer> countList = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        countList.add(freq.size());

        for (int i = k; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
            if (freq.get(nums[i - k]) == 0) {
                freq.remove(nums[i - k]);
            }
            countList.add(freq.size());
        }
        return countList;
    }
}
