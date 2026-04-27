package com.algo.array;

public class MaxSubArray {

    static void main() {
        System.out.println("Maxsubarray for [-2,1,-3,4,-1,2,1,-5,4] is: " + cal(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }


    public static int cal(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int n : nums) {
            currentSum = Math.max(n, currentSum + n);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
