import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        char[] word_array = word.toCharArray();
        for(char c: word_array)
        {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int assign = 0;
        int total_press = 0;
        int press = 1;
        for(int i = 25; i >= 0; i--)
        {
            if(freq[i] == 0)
                break;
            total_press += freq[i] * press;
            assign++;
            if(assign % 8 == 0)
            {
                press++;
            }
        }
        return total_press;
    }
}