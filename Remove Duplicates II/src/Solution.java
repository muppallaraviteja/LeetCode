class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int x = head.val;
        ListNode temp = head.next, holder = head;
        while(temp!=null){
            if(x!=temp.val){
                holder.next = temp;

            }
            System.out.println();

        }

        return head;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }

}