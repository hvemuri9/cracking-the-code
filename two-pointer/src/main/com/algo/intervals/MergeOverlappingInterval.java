package com.algo.intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingInterval {

    public static void main(String[] args) {
        System.out.println("For {{7, 8}, {1, 5}, {2, 4}, {4, 6} merged output is:  ");
        merge(new int[][]{{7, 8}, {1, 5}, {2, 4}, {4, 6}}).stream().map(Arrays::toString).forEach(System.out::println);

        System.out.println("For {{1, 3}, {2, 4}, {6, 8}, {9, 10}} merged output is:  ");
        merge(new int[][]{{1, 3}, {2, 4}, {6, 8}, {9, 10}}).stream().map(Arrays::toString).forEach(System.out::println);
    }

    private static ArrayList<int[]> merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];

            if (curr[0] <= prev[1]) {
                prev = new int[]{prev[0], Math.max(prev[1], curr[1])};
            } else {
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result;
    }

}
