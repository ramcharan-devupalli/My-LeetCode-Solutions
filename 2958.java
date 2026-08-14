class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        int maxSubarrayLen = 1;
        int len = 1;
        int left = 0, right = 0;

        h.put(nums[0], 1);

        while (right < nums.length - 1) {
            right++;

            if (h.containsKey(nums[right])) {
                h.put(nums[right], h.get(nums[right]) + 1);

                if (h.get(nums[right]) <= k) {
                    len++;
                }
                else {
                    len++;

                    while (h.get(nums[right]) > k) {
                        h.put(nums[left], h.get(nums[left]) - 1);
                        left++;
                        len--;
                    }
                }
            }
            else {
                h.put(nums[right], 1);
                len++;
            }

            if (len > maxSubarrayLen) {
                maxSubarrayLen = len;
            }
        }

        return maxSubarrayLen;
    }
}