import java.util.*;

class Solution {
    Set<String> set = new HashSet<>();
    public List<String> generateParenthesis(int n) {
        rec(n, 0, new StringBuilder(), 0, 0);
        return new ArrayList<>(set);
    }

    private void rec(int n, int valid, StringBuilder sb, int open, int close)
    {
        if(sb.length() > 2 * n || open > n || close > n || valid < 0)
        {
            return;
        }

        if(sb.length() == 2 * n)
        {
            set.add(sb.toString());
            return ;
        }

        sb.append('(');
        rec(n, valid + 1, sb, open + 1, close);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        rec(n, valid - 1, sb, open, close + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}