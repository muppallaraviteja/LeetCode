

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        int carry=0;
        ListNode head,prev,l3;
        head = new ListNode(l1.val+l2.val/10);
        l1 = l1.next;
        l2 = l2.next;
        prev = head;
        while(l1!=null || l1!=null || carry!=0){
            int sum = (l1!=null?l1.val:0) + (l1!=null?l1.val:0)+carry;
            ListNode ne =new ListNode(sum/10);
            prev.next = ne;
            carry =  sum%10;
            l1 = l1!=null?l1.next:l1;
            l2 = l2!=null?l2.next:l1;
            prev = prev.next;

        }

        return head;

    }
}
