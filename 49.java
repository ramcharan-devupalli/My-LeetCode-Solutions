import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char[] temp = strs[i].toCharArray(); 
            Arrays.sort(temp);
            String str = new String(temp);
            if(!map.containsKey(str))
            {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}