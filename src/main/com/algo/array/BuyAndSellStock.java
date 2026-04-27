package com.algo.array;

public class BuyAndSellStock {

    static void main() {
        System.out.println("MaxProfit for [7, 1, 5, 3, 6, 4] is: " + maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("MaxProfit for [7,6,4,3,1] is: " + maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minValue = Math.min(price, minValue);
            maxProfit = Math.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }


}
