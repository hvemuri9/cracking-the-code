package com.algo.binary;

/**
 * Given a positive integer n, write a function that returns the number of set bits in its
 * binary representation (also known as the Hamming weight).
 */
public class NumOfOneBits {

    static void main() {
        System.out.println("Number of set bits for 11 is: " + hammingWeight(11));
        System.out.println("Number of set bits for 128 is: " + hammingWeight(128));
        System.out.println("Number of set bits for 2147483645 is: " + hammingWeight(2147483645));
    }


    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n % 2;
            n = n >> 1;
        }
        return count;
    }
}
