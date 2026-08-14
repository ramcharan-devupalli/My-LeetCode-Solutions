import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;
        while(j < nums.length)
        {
            if(nums[i] == 0)
            {
                while(j < nums.length && j == 0)
                {
                    j++;
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
            i++;
            j++;
        }
    }
}