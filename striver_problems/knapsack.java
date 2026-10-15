class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int[][] dp = new int[val.length][W + 1];

        for(int i = 0; i < val.length; i++)
        {
            for(int j = 0; j <= W; j++)
            {
                dp[i][j] = -1;
            }
        }

        return rec(W, val, wt, 0, dp);
    }

    private int rec(int W, int val[], int wt[], int i, int[][] dp)
    {
        if(i == val.length || W == 0)
        {
            return 0;
        }

        if(dp[i][W] != -1)
        {
            return dp[i][W];
        }

        int leave = rec(W, val, wt, i + 1, dp);

        int take = 0;

        if(wt[i] <= W)
        {
            take = val[i] + rec(W - wt[i], val, wt, i + 1, dp);
        }

        dp[i][W] = Math.max(leave, take);

        return dp[i][W];
    }
}