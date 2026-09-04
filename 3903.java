//brute force

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0; i < n; i++)
        {
            int min = nums[i];
            for(int j = i + 1; j < n; j++)
            {
                if(min > nums[j])
                {
                    min = nums[j];
                }
            }
            if((max - min) <= k)
            {
                return i;
            }
            if(i < n - 1 && nums[i + 1] > max)
            {
                max = nums[i + 1];
            }
        }
        return -1;
    }
}

// optimal by time but for space additonal array[n] is required

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] right = new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.min(right[i+1],nums[i]);
        }
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, nums[i]);
            if((max - right[i]) <= k)
            {
                return i;
            }
        }
        return -1;
    }
}