import java.util.*;

class Solution {

    private String rotate(String s)
    {
        char[] c = s.toCharArray();
        char a = c[0];
        int i;
        for(i = 1; i < c.length - 2; i++)
        {
            c[i] = c[i - 1];
        }
        c[i] = a;
        return new String(c);
    }

    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.length() == 1)
        {
            return s.equals(goal) ? true : false;
        }
        for(int i = 0; i < s.length(); i++)
        {
            s = rotate(s);
            if(goal.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}