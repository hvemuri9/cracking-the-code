package com.algo.tp;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;
        int left = 0;
        int right = str.length() - 1;
        str = str.toLowerCase();

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
