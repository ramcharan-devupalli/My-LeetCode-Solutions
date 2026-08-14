import java.util.*;

class Solution 
{
    public int maximumLengthSubstring(String s)
    {
        int maxlength = 0;
        HashMap<Character, Integer> h = new HashMap<>();    
        char[] c = s.toCharArray();
        for(char i: c)
        {
            if(h.containsKey(i))
            {
                int a = h.get(i);
                h.put(i, a + 1);
                if(a + 1 >= 2)
                {
                    maxlength++;
                }
            }
            else
            {
                h.put(i, 0);
            }
        }
        return maxlength;
    };
}