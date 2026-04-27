package com.algo.array;

public class ContainerWithMostWater {


    static void main() {
        System.out.println("Max area for [1,8,6,2,5,4,8,3,7] is: " + maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] heights) {

        int l = 0, r = heights.length - 1;
        int area = Integer.MIN_VALUE;

        while (l < r) {
            int height = Math.min(heights[l], heights[r]);
            int width = r - l;
            area = Math.max(area, width * height);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return area;
    }

}
