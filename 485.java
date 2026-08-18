import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int a = 0;
            while (nums[i] == 1)
            {
                a++;
            }
            max = Math.max(max, a);
        }
        return max;
    }
}