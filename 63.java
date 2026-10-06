class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return rec(obstacleGrid, 0, 0);
    }

    private int rec(int[][] obstacleGrid, int i, int j)
    {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(i >= n || j >= m)
        {
            return 0;
        }
        if(obstacleGrid[i][j] == 1)
        {
            return 0;
        }
        if(i == n  - 1 && j == m - 1)
        {
            return 1;
        }

        return rec(obstacleGrid, i + 1, j) + rec(obstacleGrid, i, j + 1);
    }
}