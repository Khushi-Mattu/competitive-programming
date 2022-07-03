class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=result;
            result=head;
            head=next;
        }
        return result;
    }
}