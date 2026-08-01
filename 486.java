import java.util.*;

class Solution {
    public boolean predictTheWinner(int[] nums) {
        return sol(nums, 0, nums.length - 1) >= 0;
    }
    
    public int sol(int[] nums, int left, int right)
    {
        if(left > right)
        {
            return 0;
        }
        int choose_left = nums[left] - sol(nums, left + 1, right);
        int choose_right = nums[right] - sol(nums, left, right - 1);
        return Math.max(choose_left, choose_right);
    }
}