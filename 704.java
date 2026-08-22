class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length;
        int low = 0;
        while(low < high)
        {
            int mid = (low + high) / 2;
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
    }
}