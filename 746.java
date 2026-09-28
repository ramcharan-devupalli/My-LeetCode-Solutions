//memoi

class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        for(int i = 0; i < n + 1; i++)
        {
            dp[i] = -1;
        }
        return Math.min(findMin(dp, cost, 0), findMin(dp, cost, 1));
    }

    private int findMin(int[] dp, int[] cost, int i)
    {
        if(i == cost.length)
        {
            return 0;
        }
        if(i > cost.length)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i] != -1)
        {
            return dp[i];
        }
        dp[i] =  cost[i] + Math.min(findMin(dp, cost, i + 1), findMin(dp, cost, i + 2));
        return dp[i];
    }
}