class Solution {


    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null || head.next==null)
            return head;
        ListNode temp = head.next, prev = head;
        int x = head.val;
        while(temp.next!=null){
            if(x==temp.val){
                prev.next=temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
                x = prev.val;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }

}