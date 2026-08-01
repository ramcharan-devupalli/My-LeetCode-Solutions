import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i: nums)
        {
            if(i > a)
            {
                b = a;
                a = i;
            }
            else if(i > b)
            {
                b = i;
            }
        }
        return (a - 1) * (b - 1);
    }
}