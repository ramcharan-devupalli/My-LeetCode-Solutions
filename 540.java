class Solution {
    public int singleNonDuplicate(int[] nums) {
        //left  (even, odd) right (odd, even)
        if(nums.length == 1)
        {
            return nums[0];
        }
        if(nums.length == 0)
        {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if((low == high) || (mid == 0) || (mid == nums.length - 1)) return nums[mid];
            if((nums[mid] == nums[mid + 1] && mid % 2 == 0) || (nums[mid] == nums[mid - 1] && mid % 2  != 0))
            {
                low = mid + 1;
            }
            else if((nums[mid] == nums[mid + 1] && mid % 2 != 0) || (nums[mid] == nums[mid - 1] && mid % 2  == 0))
            {
                high = mid - 1;
            }
            else
            {
                return nums[mid];
            }
        }
        return -1;
    }
}