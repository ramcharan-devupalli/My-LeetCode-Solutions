import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            list.add(nums[i]);
        }
        int x = 1;
        while(true)
        {
            if(!list.contains(k * x))
            {
                return k * x;
            }
            x++;
        }
    }
}

//without arraylist
class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i = 1; ;i++)
        {
            boolean found = false;
            int x = k * i;
            for(int num: nums)
            {
                if(x == num)
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                return x;
            }
        }
    }
}