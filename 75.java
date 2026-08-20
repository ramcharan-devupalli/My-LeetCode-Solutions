class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = nums.length;
        for(int a = 0; a < n; a++)
        {
            if(nums[a] == 0)
                i++;
            if(nums[a] == 1)
                j++;
            if(nums[a] == 2)
                k++;
        }
        for(int a = 0; a < n; a++)
        {
            if(i != 0)
            {
                nums[a] = 0;
            }
            else if(j != 0)
            {
                nums[a] = 1;
            }
            else if(k != 0)
            {
                nums[a] = 2;
            }
        }
    }
}