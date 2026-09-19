import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp.next != null)
        {
            temp = temp.next;
            length++;
        }
        int count = 0;
        int mid = length / 2 + 1;
        temp = head;
        while(count != mid)
        {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}