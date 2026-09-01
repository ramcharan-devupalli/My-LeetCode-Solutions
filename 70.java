import java.util.*;


//memoization approach : you save the result of a computation so you don’t have to calculate it again when given the same inputs
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];

        return solve(n, dp);
    }
    
    private int solve(int n, int[] dp)
    {
        if(n <= 2)
        {
            return n;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }
}

//recursive approach (but leads to TLE)
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}