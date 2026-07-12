class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, right = 0;
        int subarrays = 0, count = 0;
        int target = k;

        while (right < nums.length) {
            if (nums[right] % 2 != 0) {
                target--;
                count = 0;
            }
            while (target == 0) {
                target += nums[left] % 2;
                left++;
                count++;
            }
            subarrays += count;
            right++;
        }
        return subarrays;
    }
}