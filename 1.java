import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            map.put(nums[i], i);
        }
        for(int i = 0; i < n; i++)
        {
            int k = nums[i] - target;
            if(map.containsKey(k))
            {
                two[0] = i;
                two[1] = map.get(i);
            }
        }
        return two;
    }
}