 //recursive
 
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return rec(nums, 0, n);
    }

    private int rec(int[] nums, int i, int n)
    {
        if(i >= n)
        {
            return 0;
        }
        return Math.max(rec(nums, i + 1, n), rec(nums, i + 2, n) + nums[i]);
    }
}

//for better explanation

 class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return rec(nums, 0, n);
    }

    private int rec(int[] nums, int i, int n)
    {
        if(i >= n)
        {
            return 0;
        }

        int house_excluded = rec(nums, i + 1, n);
        int house_included = rec(nums, i + 2, n) + nums[i];

        return Math.max(house_excluded, house_included);
    }
}

//memo

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return rec(nums, dp, 0, n);
    }

    private int rec(int[] nums, int[]dp, int i, int n)
    {
        if(i >= n)
        {
            return 0;
        }
        if(dp[i] != -1)
        {
            return dp[i];
        }
        dp[i] = Math.max(rec(nums, dp, i + 1, n), rec(nums, dp, i + 2, n) + nums[i]);
        return dp[i];
    }
}

