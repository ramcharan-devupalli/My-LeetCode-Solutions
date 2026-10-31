// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n + 1][n + 1];
//         return rec(nums, n - 1, n, dp);
//     }

//     private int rec(int[]nums, int i, int j, int[][] dp)
//     {
//         if(i < 0)
//         {
//             return 0;
//         }
//         if(dp[i][j] != 0)
//         {
//             return dp[i][j];
//         }
//         int excluded = rec(nums, i - 1, j, dp);
//         int included = 0;
//         if(j == nums.length || nums[i] < nums[j])
//         {
//             included = rec(nums, i - 1, i, dp);
//         }

//         dp[i][j] = Math.max(excluded, included + 1);
//         return dp[i][j];
//     }
// }


//alternative approach

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int besttillnow = 0;
            for(int j = i - 1; j >= 0; j--)
            {
                if(nums[i] > nums[j])
                {
                    besttillnow = Math.max(dp[j], besttillnow);
                }
            }
            dp[i] = besttillnow + 1;
        }
        int res = 0;
        for(int i : nums)
        {
            res = Math.max(i, res);
        }
        return res;
    }
}