
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            ListNode temp1 = temp;
            while (temp != null && temp.val == temp1.val) {
                temp = temp.next;
            }
            temp1.next = temp;
        }
        return head;
    }
}