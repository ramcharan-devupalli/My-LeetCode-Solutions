class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int currsum = 0;
        int result = Integer.MAX_VALUE;
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        int[] minlengthstillidx = new int[n];

        while (j < n)
        {
            currsum += arr[j];

            while (i <= j && currsum > target)
            {
                currsum -= arr[i++];
            }

            if(currsum == target)
            {
                count++;
                int length = j - i + 1;

                if(i > 0 && minlengthstillidx[i - 1] != Integer.MAX_VALUE)
                {
                    result = Math.min(result,
                                      length + minlengthstillidx[i - 1]);
                    i++;
                }
                minLength = Math.min(minLength, length);
            }

            minlengthstillidx[j] = minLength;
            j++;
        }
        if(count > 2)
        {
            return -1;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}