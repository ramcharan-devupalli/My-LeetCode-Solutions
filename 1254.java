class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int islands = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 0 && visited[i][j] == 0)
                {
                    if(visitIsland(grid, visited, i, j))
                    {
                        islands++;
                    }
                }
            }
        }
        return islands;
    }
    private boolean visitIsland(int[][] grid, int[][] visited, int i, int j)
    {
        int n = grid.length;
        int m = grid[0].length;

        visited[i][j] = 1;

        boolean closed = true;

        if(i == 0 || j == 0 || i == n - 1 || j == m - 1)
        {
            closed = false;
        }

        if(i > 0 && grid[i - 1][j] == 0 && visited[i - 1][j] == 0)
        {
            boolean north = visitIsland(grid, visited, i - 1, j);
            closed = closed && north;
        }
        if(j > 0 && grid[i][j - 1] == 0 && visited[i][j - 1] == 0){

            boolean west = visitIsland(grid, visited, i, j - 1);
            closed = closed && west;
        }
        if(i + 1 < n && grid[i + 1][j] == 0 && visited[i + 1][j] == 0)
        {
            boolean south = visitIsland(grid, visited, i + 1, j);
            closed = closed && south;
        }
        if(j + 1 < m && grid[i][j + 1] == 0 && visited[i][j + 1] == 0)
        {
            boolean east = visitIsland(grid, visited, i, j + 1);
            closed = closed && east;
        }
        return closed;
    }
}