import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
                row.add(grid[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}