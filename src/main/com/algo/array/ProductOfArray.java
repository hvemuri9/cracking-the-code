package com.algo.array;

import java.util.Arrays;

public class ProductOfArray {

    static void main() {
        System.out.println("Product of [1,2,3,4] is: " + Arrays.toString(productExceptSelfBF(new int[]{1, 2, 3, 4})));
        System.out.println("Product of[-1,1,0,-3,3] is: " + Arrays.toString(productExceptSelfBF(new int[]{-1, 1, 0, -3, 3})));

        System.out.println("Product of [1,2,3,4] is: " + Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println("Product of[-1,1,0,-3,3] is: " + Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelfBF(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            res[i] = product;
        }
        return res;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }

}
