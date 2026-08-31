import java.util.*;


public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

//Brute force
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head.next;
        int count = 1;
        ListNode prev = head;
        while (curr.next != null) {
            if((curr.val > curr.next.val && curr.val > prev.val) || (curr.val < curr.next.val && curr.val < prev.val))
            {
                list.add(count);
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        int min_length = Integer.MAX_VALUE;
        int max_length = 0;
        int n = list.size();
        for(int i = 1; i < n; i++)
        {
            min_length = Math.min(max_length, (list.get(i) - list.get(i - 1)));
        }
        max_length = list.get(n - 1) - list.get(0);
        int[] res = {min_length , max_length};
        return res;
    }
}

// optimal solution (using 3 pointer)
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode nex = curr.next;

        int first_critical = -1;
        int prev_critical = -1;
        int count = 1;

        int max_length = 0;
        int min_length = Integer.MAX_VALUE;

        while(nex != null)
        {
            if((curr.val > nex.val && curr.val > prev.val) || (curr.val < nex.val && curr.val < prev.val))
            {
                if(first_critical == -1)
                {
                    first_critical = count;
                }
                if(prev_critical != -1)
                {
                    min_length = Math.min(min_length, count - prev_critical);
                }
                prev_critical = count;
            }
            count++;
            prev = curr;
            curr = nex;
            nex = nex.next;
        }
        if (prev_critical == first_critical) {
            return new int[]{-1, -1};
        }
        max_length = prev_critical - first_critical;
        return new int[]{min_length, max_length};
    }
}