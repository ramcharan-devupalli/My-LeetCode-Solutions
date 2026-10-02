//recursive

// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
        
//         return rec(0, 0, n, m, grid);
//     }
//     private int rec(int i, int j, int n, int m, int[][] grid) {
//         if(i >= n || j >= m) {

//             return Integer.MAX_VALUE;
//         }

//         if(i == n - 1 && j == m - 1) {
//             return grid[i][j];
//         }

//         int down = rec(i + 1, j, n, m, grid);
//         int right = rec(i, j + 1, n, m, grid);

//         return grid[i][j] + Math.min(down, right);
//     }
// }

//dp memo

import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                dp[i][j] = -1;
            }
        }
        return rec(0, 0, n, m, grid, dp);
    }
    private int rec(int i, int j, int n, int m, int[][] grid, int[][] dp) {
        if(i >= n || j >= m) {

            return Integer.MAX_VALUE;
        }

        if(i == n - 1 && j == m - 1) {
            return grid[i][j];
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        int down = rec(i + 1, j, n, m, grid, dp);
        int right = rec(i, j + 1, n, m, grid, dp);

        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[n][m];
    }
}


