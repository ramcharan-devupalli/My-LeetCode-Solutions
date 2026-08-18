import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int len = 0;
       int sum = 0;
       for(int i = 0; i < nums.length; i++)
       {
            sum += nums[i];
            int rem = sum - k;
            if(map.containsKey(rem))
            {
                int a = map.get(rem);
                len = Math.max(len, i - a);
                if(len == k)
                {
                    break;
                }
            }
            if(!map.containsKey(sum)) //so that the same sum doesnt get added (change in index/value) due to additon of 0's
            {
                map.put(sum, i);
            }
       }
       return len;
    }
}