//rec

class Solution {

    private int rec(int[] coins, int amt, int[] dp)
    {
        if(amt == 0)
        {
            return 0;
        }
        if(amt < 0)
        {
            return 100000;
        }
        if(dp[amt] != 0)
        {
            return dp[amt];
        }
        int ans = 100000;
        for(int coin: coins)
        {
            int remaining_sum = amt - coin;
            int noOfCoinsForRemSum = rec(coins, remaining_sum, dp);
            ans = Math.min(ans, noOfCoinsForRemSum);
        }
        dp[amt] = ans + 1;
        return dp[amt];
    }
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[coins.length];
        int ans = rec(coins, amount, dp);
        if(ans == 10001)
        {
            return -1;
        }
        return ans;
    }
}