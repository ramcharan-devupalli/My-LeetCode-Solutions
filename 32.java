class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                int j = i + 1;
                int counter = 0;
                while(counter != -1)
                {
                    if(j >= s.length())
                    {
                        break;
                    }
                    if(s.charAt(j) == '(')
                    {
                        counter++;
                    }
                    else
                    {
                        counter--;
                    }
                    j++;
                    if(counter == -1)
                    {
                        maxlen = Math.max(maxlen, j - i + 1);
                    }
                }
            }
        }
        return maxlen;
    }
}