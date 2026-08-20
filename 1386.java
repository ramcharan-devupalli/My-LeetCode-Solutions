import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] seats: reservedSeats)
        {
            if(!map.containsKey(seats[0]))
            {
                map.put(seats[0], new ArrayList<>());
            }
            map.get(seats[0]).add(seats[1]);
        }
        count = (n - map.size()) * 2;
        for(int row: map.keySet())
        {
            boolean left = true;
            boolean middle = true;
            boolean right = true;
            
            for(int seat: map.get(row))
            {
                if(seat >= 2 && seat <= 5)
                {
                    left = false;
                }
                if(seat >= 4 && seat <= 7)
                {
                    middle = false;
                }
                if(seat >= 6 && seat <= 9)
                {
                    right = false;
                }
            }
            if(left && right))
            {
                count += 2;
            }
            else(left || middle || right)
            {
                count++;
            }
        }

        return count;
    }
}