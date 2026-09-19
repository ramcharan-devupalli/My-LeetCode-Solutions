import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int top = -1;
        temp = head;
        int[] stack = new int[length / 2];

        for (int i = 0; i < length / 2; i++) {
            stack[++top] = temp.val;
            temp = temp.next;
        }
        if (length % 2 != 0) {
            temp = temp.next;
        }
        while (temp != null) {
            if (temp.val != stack[top--]) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}


class Solution {

    private ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode curr = node;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next);
        ListNode temp = head;
        while(rev != null)
        {
            if(temp.val != rev.val)
            {
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;
        
    }
}