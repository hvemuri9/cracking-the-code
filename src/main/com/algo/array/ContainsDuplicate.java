package com.algo.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    static void main() {
        System.out.println("Does [1,2,3,1] contains duplicate? " + containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println("Does [1,2,3,4] contains duplicate? " + containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
