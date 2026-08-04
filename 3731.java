import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            min = Math.min(nums[i], min);
            max = Math.max(max, nums[i]);
        }
        for(int i = min; i <= max; i++)
        {
            if(!set.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}