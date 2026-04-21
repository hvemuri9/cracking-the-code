package com.algo.binary;

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 * Example 1:
 * <p>
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 * <p>
 * Input: a = 2, b = 3
 * Output: 5
 */
public class SumOfTwo {

    static void main() {
        System.out.println("Sum of a=1 and b=2 is: " + getSum(1, 2));
        System.out.println("Sum of a=2 and b=3 is: " + getSum(2, 3));
    }

    public static int getSum(int a, int b) {

        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}
