import java.util.*;

class Solution {
    public String removeOuterParentheses(String s) {
        int parantheses_count = 0;
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                parantheses_count++;
                if(parantheses_count > 1)
                {
                    sb.append(c);
                }
            }
            else if(c == ')')
            {
                if(parantheses_count > 1)
                {
                    sb.append(c);
                }
                parantheses_count--;
            }
        }
        String res = new String(sb);
        return res;
    }
}

class Optimal_Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}