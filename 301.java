import java.util.*;

class Solution {
    Set<String> set = new HashSet<>();
    int maxLen;
    
    private void rec(String s, int i, StringBuilder st, int count, int n)
    {
        if(count < 0)
        {
            return;
        }

        if(i == n)
        {
            if(count == 0)
            {
                int len = st.length();
                if(len > maxLen)
                {
                    maxLen = len;
                    set.clear();
                }
                
                if(len == maxLen)
                {
                    set.add(st.toString());
                }
            }
            return;
        }
        char c = s.charAt(i);

        if(c != ')' && c != '(')      
        {
            st.append(c);
            rec(s, i + 1, st, count, n);
            st.deleteCharAt(st.length() - 1);
            return;
        }

        st.append(c);
        rec(s, i + 1, st, count + (c == '(' ? 1 : -1), n);
        st.deleteCharAt(st.length() - 1);
        rec(s, i + 1, st, count, n);
    }

    public List<String> removeInvalidParentheses(String s) {
        int n = s.length();
        rec(s, 0, new StringBuilder(), 0, n);
        return new ArrayList<>(set);
    }

}