class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++)
        {
            max = Math.max(max, rec(grid, i, 0));
        }
        return max;

    }

    private int rec(int[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j >= grid[0].length)
        {
            return 0;
        }

        int top_right = rec(grid, i - 1, j + 1);
        int right = rec(grid, i, j + 1);
        int bottom_right = rec(grid, i + 1, j + 1);

        return Math.max(top_right, Math.max(right, bottom_right)) + grid[i][j];
    }
}