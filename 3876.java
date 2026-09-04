import java.util.*;;

class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int even = 0;
        for(int i = 0; i < n; i++)
        {
            if(nums1[i] % 2 == 0)
            {
                even++;
            }
        }
        if(even == n || even == 0)
        {
            return true;
        }
        int min = nums1[0];
        for(int i = 1; i < n; i++)
        {
            if(nums1[i] < min)
            {
                min = nums1[i];
            }
        }
        return (min % 2 != 0);
    }
}