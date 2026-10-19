class Solution {
    public int minSwaps(int[] nums) {
        int swaps = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int maxSum = digitSum(nums[i]);
            int maxIndex = i;
            for(int j = i + 1; j < n; j++)
            {
                int sum = digitSum(nums[j]);
                if(sum > maxSum)
                {
                    maxSum = sum;
                    maxIndex = j;
                }
                if(sum == maxSum)
                {
                    if(nums[maxIndex] < nums[j])
                    {
                        maxSum = sum;
                        maxIndex = j;
                    }
                }
            }
            if(maxIndex != i)
            {
                swaps++;
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
            }
        }
        return swaps;
    }
    private int digitSum(int n)
    {
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum += i;
            n = n / 10;
        }
        return sum;
    }
}