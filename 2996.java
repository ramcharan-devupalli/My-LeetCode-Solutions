import java.util.*;;

class Solution {
    public int missingInteger(int[] nums) {
        int largest_prefix_len = 1;
        int i = 0;
        int sum = nums[0];
        while (i + 1 < nums.length && nums[i] == nums[i + 1] + 1) {
            largest_prefix_len++;
            sum += nums[i + 1];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j : nums)
        {
            set.add(j);
        }
        while (true) {
            if(!set.contains(sum))
            {
                break;
            }
            sum++;
        }
        return sum;
    }
}

int x = sum;

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }

            x++;
        }
    }
}

