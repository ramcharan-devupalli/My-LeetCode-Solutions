import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted_arr = arr.clone();
        Arrays.sort(sorted_arr);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(!rank.containsKey(sorted_arr[i]))
            {
                rank.put(sorted_arr[i], r++);
            }
        }

        int[] rank_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            rank_arr[i] = rank.get(arr[i]);
        }
        return rank_arr;
    }
}