class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int islands_k = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] != 0 && visited[i][j] == 0)
                {
                    long sum = visitIsland(grid, visited, i, j);
                    if(sum % k == 0)
                    {
                        islands_k++;
                    }
                }
            }
        }
        return islands_k;
    }

    private long visitIsland(int[][] grid, int[][] visited, int i, int j)
    {
        int n = grid.length;
        int m = grid[0].length;
        long sum = grid[i][j];
        visited[i][j] = 1;
        if(i - 1 >= 0 && grid[i - 1][j] != 0 && visited[i - 1][j] == 0)
        {
            sum += visitIsland(grid, visited, i - 1, j);
        }
        if(j - 1 >= 0 && grid[i][j - 1] != 0 && visited[i][j - 1] == 0)
        {
            sum += visitIsland(grid, visited, i, j - 1);
        }
        if(i + 1 < n && grid[i + 1][j] != 0 && visited[i + 1][j] == 0)
        {
            sum += visitIsland(grid, visited, i + 1, j);
        }
        if(j + 1 <m && grid[i][j + 1] != 0 && visited[i][j + 1] == 0)
        {
            sum += visitIsland(grid, visited, i, j + 1);
        }
        return sum;
    }
}