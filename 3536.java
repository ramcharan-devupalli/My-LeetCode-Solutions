class Solution {
    public int maxProduct(int n) {
        
        String s = Integer.toString(n);
        char[] ch = s.toCharArray();
        int x = ch.length;
        int[] nums = new int[x];
        for(int i = 0; i < x; i++)
        {
            nums[i] = ch[i] - '0';
        }

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i: nums)
        {
            if(i > a)
            {
                b = a;
                a = i;
            }
            else if(i > b)
            {
                b = i;
            }
        }
        return (a - 1) * (b - 1);
    }
}