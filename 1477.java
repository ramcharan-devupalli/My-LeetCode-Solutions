class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int currsum = 0;
        int result = Integer.MAX_VALUE;
        int minLength = Integer.MAX_VALUE;

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
                int length = j - i + 1;

                if(i > 0 && minlengthstillidx[i - 1] != 0)
                {
                    result = Math.min(result,
                                      length + minlengthstillidx[i - 1]);
                }

                minLength = Math.min(minLength, length);
            }

            minlengthstillidx[j] = minLength;
            j++;
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}