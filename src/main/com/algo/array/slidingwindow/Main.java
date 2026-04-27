package com.algo.array.slidingwindow;

import com.algo.array.slidingwindow.fixed.CountDistinct;
import com.algo.array.slidingwindow.variable.LongestSubArray;
import com.algo.array.slidingwindow.fixed.MaxSubArraySum;
import com.algo.array.slidingwindow.fixed.MaxXOR;

import java.util.Arrays;

public class Main {

    static void main(String[] args) {

        System.out.println("MaxSubArraySum of {5, 2, -1, 0, 3} for k=3 is:  " + MaxSubArraySum.maxSum(new int[]{5, 2, -1, 0, 3}, 3));

        System.out.println("MaxXOR of {2, 5, 8, 1, 1, 3} for k=3 - naive is: " + MaxXOR.naiveXOR(new int[]{2, 5, 8, 1, 1, 3}, 3));
        System.out.println("MaxXOR of {2, 5, 8, 1, 1, 3} for k=3 - best is: " + MaxXOR.bestXOR(new int[]{2, 5, 8, 1, 1, 3}, 3));

        System.out.println("Count Distinct In Every Window of Size K=4 for array {1, 2, 1, 3, 4, 2, 3} is : " +
                Arrays.toString(CountDistinct.count(new int[]{1, 2, 1, 3, 4, 2, 3}, 4).toArray()));

        System.out.println(LongestSubArray.findLength(new int[]{3, 1, 2, 2, 2, 2}));

    }
}
