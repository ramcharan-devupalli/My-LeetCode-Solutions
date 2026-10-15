class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for(int i = 0; i < coins.length; i++)
        {
            for(int j = 0; j < amount + 1; j++)
            {
                dp[i][j] = -1;
            }
        }
        return tab(coins, amount, dp);
    }

    int memo (int[] coins, int amt, int i, int[][] dp)
    {
        if(amt == 0)
        {
            return 1;
        }
        if(amt < 0)
        {
            return 0;
        }
        if(i >= coins.length)
        {
            return 0;
        }

        if(dp[i][amt] != -1)
        {
            return dp[i][amt];
        }

        dp[i][amt] = memo(coins, amt - coins[i], i, dp) + memo(coins, amt, i + 1, dp);
        return dp[i][amt];
    }

    int tab(int[] coins, int amount, int[][] dp)
    {
        for(int i = coins.length - 1; i >= 0; i--)
        {
            for(int amt = 0; amt <= amount; amt++)
            {
               if(amt == 0)
                {
                    dp[i][amt] = 1;
                    continue;
                }
                dp[i][amt] = dp[i][amt - coins[i] >= 0 ? amt - coins[i] : 0] + dp[i + 1 < coins.length ? i + 1 : coins.length][amt];
                return dp[i][amt]; 
            }
        }
    }
}