//brute

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++)
        {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
        }
        int k = k1 + k2;
        while(k > 0)
        {
            int maxIndex = 0;
            int max = 0;
            for(int i = 0; i < n; i++)
            {
                if(max < diff[i])
                {
                    max = diff[i];
                    maxIndex = i;
                }
            }
            if(diff[maxIndex] != 0)
            {
                diff[maxIndex]--;
            }
            k--;
        }
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            res = res + (int)Math.pow(diff[i], 2);
        }
        return res;
    }
}