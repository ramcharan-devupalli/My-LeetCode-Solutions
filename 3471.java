import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        int max = -1;

        if(k == nums.length)
        {
            for(int num : nums)
            {
                max = Math.max(max, num);
            }
            return max;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if(k == 1)
        {
            for (int num : nums)
            {
                if (map.get(num) == 1)
                {
                    max = Math.max(max, num);
                }
            }
            return max;
        }

        if(map.get(nums[0]) == 1)
        {
            max = Math.max(max, nums[0]);
        }

        if(map.get(nums[n - 1]) == 1)
        {
            max = Math.max(max, nums[n - 1]);
        }

        return max;
    }
}