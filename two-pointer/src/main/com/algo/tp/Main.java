package com.algo.tp;

import java.util.Arrays;

public class Main {

    static void main() {
        //TwoSum
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{1, 2, 3, 4, 5, 6}, 3)));

        //MergeTwoSortedArrays
        MergeTwoSortedArrays.merge(new int[]{1, 5, 9, 10, 15, 20}, new int[]{2, 3, 8, 13});

        //Palindrome
        System.out.println("Is CIVIC Palindrome: " + Palindrome.isPalindrome("Civic"));
        System.out.println("Is HEMA Palindrome: " + Palindrome.isPalindrome("Hema"));

        //ReverseArray
        ReverseArray.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
