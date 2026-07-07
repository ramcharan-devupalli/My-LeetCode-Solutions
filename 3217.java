class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
            Set<Integer> n = new HashSet<>();
            for(int x: nums)
            {
                n.add(x);
            }
            ListNode temp1 = head;
            ListNode temp2 = null;
            while(temp1 != null)
            {
                boolean deleted = false;
                if(n.contains(temp1.val))
                {
                    if(temp2 == null)
                    {
                        head = head.next;
                    }
                    else
                    {
                        temp2.next = temp1.next;
                    }
                    deleted = true;
                }
                if(!deleted){
                    temp2 = temp1;
                }
                temp1 = temp1.next;
            }
            return head;
    }
}