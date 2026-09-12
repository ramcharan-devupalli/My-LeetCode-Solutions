class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = -1;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
            {
                return mid;
            }
            if(nums[mid + 1] > nums[mid])
            {
                low = mid + 1;
            }
            if(nums[mid - 1] > nums[mid])
            {
                high = mid - 1;
            }
        }
        return mid;
    }
}