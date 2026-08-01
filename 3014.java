import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int i = 1;
        int total_press = 0;
        int press = 1;
        while(i <= n){
            total_press += press;
            if(i % 8 == 0)
            {
                press++;
            }
            i++;
        }
        return total_press;
    }
}