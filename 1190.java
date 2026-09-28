import java.util.*;


class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] stack = new int[n];
        int top = -1;
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == ')')
            {
                List<Character> list = new ArrayList<>();
                while(stack[top] != '(')
                {
                    list.add(stack[top--]);
                }
                top--;
                for(int j = 0; j < list.size(); j++)
                {
                    stack[++top] = list.get(j);
                }
            }
            else
            {
                stack[++top] = s.charAt(i);
            }
        }
        return new String(stack, 0, top+ 1);
    }
}