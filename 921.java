import java.util.*;

class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                stack[++top] = c;
            }
            else
            {
                if(top == -1)
                {
                    count++;
                    continue;
                }
                top--;
            }
        }
        while (top != -1) {
            count++;
            top--;
        }
        return count;
    }
}