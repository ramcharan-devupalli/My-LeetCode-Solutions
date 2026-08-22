class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length;
        int low = 0;
        int mid = 0;
        while(low < high)
        {
            mid = (low + high) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        if(target > nums[mid])
        {
            return mid + 1;
        }
        return mid - 1;
    }
}