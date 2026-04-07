package com.algo.tp;

import java.util.Arrays;

public class Main {

    static void main() {
        //TwoSum
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{1, 2, 3, 4, 5, 6}, 3)));
        System.out.println("Distinct Count: " + TwoSum.countDistinctPairs(new int[]{1, 1, 2, 3, 3, 4, 5, 5}, 6));
        System.out.println("ClosetToTarget: 1, 4, 7, 10 and t = 12 :" + Arrays.toString(TwoSum.findClosetToTarget(new int[]{1, 4, 7, 10}, 12)));
        System.out.println("ClosetToTarget: 1, 2, 4, 8, 10 and t = 14 :" + Arrays.toString(TwoSum.findClosetToTarget(new int[]{1, 2, 4, 8, 10}, 14)));
        System.out.println("ClosetToTarget: -10, -5, 0, 5, 12 and t = 3 :" + Arrays.toString(TwoSum.findClosetToTarget(new int[]{-10, -5, 0, 5, 12}, 3)));
        System.out.println("ClosetToTarget: 1, 2, 3, 4 and t = 100 :" + Arrays.toString(TwoSum.findClosetToTarget(new int[]{1, 2, 3, 4}, 100)));

        //MergeTwoSortedArrays
        MergeTwoSortedArrays.merge(new int[]{1, 5, 9, 10, 15, 20}, new int[]{2, 3, 8, 13});

        //Palindrome
        System.out.println("Is CIVIC Palindrome: " + Palindrome.isPalindrome("Civic"));
        System.out.println("Is HEMA Palindrome: " + Palindrome.isPalindrome("Hema"));

        //ReverseArray
        ReverseArray.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        //DutchNationalFlag
        DutchNationalFlag.sort012(new int[]{2, 0, 2, 1, 1, 0});
        DutchNationalFlag.sort012(new int[]{2, 0, 1});

        //Subsequence
        System.out.println("Is abc subString of ahbgc: " + SubsequenceChecker.isSubSequence("abc", "ahbgc"));
        System.out.println("Is abc subString of ahabc: " + SubsequenceChecker.isSubSequence("abc", "ahabc"));

        //MoveZeroes
        MoveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});

        //3Sum
        System.out.println(Arrays.toString(ThreeSum.getDistinctList(new int[]{-1, 0, 1, 2, -1, -4}).toArray()));
        System.out.println(ThreeSum.closeToTarget(new int[]{-1, 2, 1, -4}));

        //4Sum
        System.out.println(Arrays.toString(FourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0).toArray()));
    }
}
