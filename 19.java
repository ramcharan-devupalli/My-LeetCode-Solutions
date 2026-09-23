import java.util.*; 

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int mid = 1;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            mid++;
        }
        int N;
        if(fast == null)
        {
            N = (mid - 1) * 2;
        }
        else
        {
            N = ((mid - 1) * 2) + 1;
        }
        int target = N - n + 1;
        ListNode temp = head;
        ListNode temp1 = null;
        for(int i = 0; i < target; i++)
        {   
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = temp.next;
        temp.next = null;

    }
}