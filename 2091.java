import java.util.*;

//brute force
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1)
        {
            return 1;
        }
        if(n == 2)
        {
            return 2;
        }
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        int max = Integer.MIN_VALUE;
        int max_index = -1;
        for(int i = 0; i < n; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
                min_index = i;
            }
            if(max < nums[i])
            {
                max = nums[i];
                max_index = i;
            }
        }
        int mid = (n - 1) / 2;
        if((min_index <= mid && max_index <= mid) || (min_index >= mid && max_index >= mid))
        {
            if(min_index == mid)
            {
                return min_index + 1;
            }
            return max_index + 1;
        }
        if(min_index > mid)
        {
            min_index = n  - min_index;
        }
        else
        {
            min_index++;
        }
        if(max_index > mid)
        {
            max_index = n - max_index;
        }
        else
        {
            max_index++;
        }
        return min_index + max_index;
    }
}

//better & optimal
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = -1;
        int max_index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                min_index = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }

        // Make min_index the smaller index
        if (min_index > max_index) {
            int temp = min_index;
            min_index = max_index;
            max_index = temp;
        }

        int left = max_index + 1;

        int right = n - min_index;

        int both = (min_index + 1) + (n - max_index);

        return Math.min(left, Math.min(right, both));
    }
}