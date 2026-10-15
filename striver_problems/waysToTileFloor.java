class Solution {
    public int numberOfWays(int n) {
        int[] dp = new int[n + 1];
        return rec(n, dp);
    }

    private int rec (int n, int[] dp)
    {
        if(n == 1)
        {
            return 1;
        }
        if(n == 2)
        {
            return 2;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }
        
        dp[n] = rec(n - 1, dp) + rec(n - 2, dp);
        return dp[n];
    }

    private int tab (int n, int dp[])
    {
        for(int i = 1; i <= n; i++)
        {
            if(n == 1)
            {
                dp[i] = 1;
                continue;
            }
            if(n == 2)
            {
                dp[n] = 2;
                continue;
            }
            dp[n] = dp[n - 1] + dp[n - 2];
        }
    }
}