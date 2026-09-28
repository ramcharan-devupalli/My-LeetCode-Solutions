import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int left = 0;
        int right = 0;
        StringBuffer sb = new StringBuffer();

        HashMap<String, String> map = new HashMap<>();

        for(List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }


        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                left = i;
                while(s.charAt(i) != ')')
                {
                    i++;
                }
                right = i;
                String present = s.substring(left + 1, right);
                if(map.containsKey(present))
                {
                    sb.append(map.get(present));
                }
                else
                {
                    sb.append("?");
                }
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);
    }
}