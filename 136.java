import java.util.*;

//brute force
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        for(int i: map.keySet())
        {
            if(map.get(i) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}

//optimal by using xor operation
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }
}