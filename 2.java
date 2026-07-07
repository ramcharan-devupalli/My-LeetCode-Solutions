class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0)
        {
            int x;
            int y;
            if(l1 != null)
            {
                x = l1.val;
            }
            else{x = 0;}
            if(l2 != null)
            {
                y = l2.val;
            }
            else
            {
                y = 0;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if(l1 != null)
            {
                l1 = l1.next;
            }
            if(l2 != null)
            {
                l2 = l2.next;
            }
        }
        return head.next;
    }
}