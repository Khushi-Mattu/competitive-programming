/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
         ListNode curr=dummy;
        if(head==null || head.next==null){
             return head;
        }
        while(curr.next!=null && curr.next.next!=null){
          if(curr.next.val==curr.next.next.val){
              int value=curr.next.val;
              while(curr.next!=null && curr.next.val==value){
                  curr.next=curr.next.next;
              }
          }
          else{
              curr=curr.next;
          }  
        }
        return dummy.next;
    }
}