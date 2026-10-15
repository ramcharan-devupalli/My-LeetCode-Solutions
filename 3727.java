//brute
import java.util.*;


import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        int small = 0;
        int big = arr.length - 1;
        int sign = 0;
        long res = 0;

        while(big >= small)
        {
            if(sign == 0)
            {
                res += arr[big];
                big--;
                sign = 1;
            }
            else
            {
                res -= arr[small];
                small++;
                sign = 0;
            }
        }

        return res;
    }
}
