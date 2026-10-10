class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        int star_count = 0;
        for(int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if(c == '*')
            {
                star_count++;
            }
            else if(c == '(')
            {
                stack[++top] = c;
            }
            else
            {
                if(top == -1 && star_count > 0)
                {
                    star_count--;
                    continue;
                }
                top--;
            }
        }
        while(star_count > 0 && top > -1)
        {
            top--;
            star_count--;
        }
        if(top == -1)
        {
            return true;
        }
        return false;
    }
}