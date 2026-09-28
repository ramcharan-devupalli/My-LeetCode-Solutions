import java.util.*;

class Solution {
    public int maxDepth(String s) {
        int maxnest = -1;
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
                maxnest = Math.max(maxnest, count);
            }
            else if(s.charAt(i) == ')')
            {
                count--;
            }
        }
        return maxnest == -1? 0 : maxnest;
    }
}