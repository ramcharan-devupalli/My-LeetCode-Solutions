class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int rows = intervals.length;
        int rem_intervals = rows;
        boolean[] removed = new boolean[rows];
        for(int i = 0; i < rows; i++)
        {
            if (removed[i]) continue;
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j = 0; j < rows; j++)
            {
                if(j == i || removed[j]) continue;
                if(intervals[j][0] >= a && intervals[j][1] <= b)
                {
                    removed[j] = true;
                    rem_intervals--;
                }
            }
        }
        return rem_intervals;
    }
}