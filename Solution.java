import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null)
        {
            if(map.containsKey(temp))
            {
                return true;
            }
            map.put(temp, temp.val);
            temp = temp.next;
        }
        return false;
    }
}

//tortoise & hare method

public class Solution {
    public boolean hasCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    
}