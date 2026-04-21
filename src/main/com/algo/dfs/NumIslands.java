package com.algo.dfs;

public class NumIslands {

    static void main() {
        char[][] grid = {{'1', '1', '0', '1'}, {'1', '1', '0', '1'}, {'1', '1', '0', '0'}};
        System.out.println("Number of islands for grid: {{1,1,0,1},{1,1,0,1},{1,1,0,0}} is  " + numOfIslands(grid));
    }

    /**
     * Time Complexity: O(m*n)
     * Space Complexity: O(m*n) because of recursive -- call stack memory
     *
     * @param grid
     * @return total number of islands
     */
    private static int numOfIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int totalIslands = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                if (grid[m][n] == '1') {
                    totalIslands++;
                    explore(grid, m, n);
                }
            }
        }
        return totalIslands;
    }

    private static void explore(char[][] grid, int m, int n) {
        if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == '0')
            return;

        grid[m][n] = '0';

        explore(grid, m + 1, n);
        explore(grid, m - 1, n);
        explore(grid, m, n + 1);
        explore(grid, m, n - 1);

    }
}
