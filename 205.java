//brute force

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a))
            {
                if(map.get(a) == b)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else if(!map.containsKey(a) && list.contains(b))
            {
                return false;
            }
            else
            {
                map.put(a, b);
                list.add(b);
            }
        }
        return true;
    }
}