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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode();
        ListNode even=new ListNode();
        ListNode tempodd=odd;
        ListNode tempeven=even;
        
        while(head!=null){
            if(head.next==null){
                tempodd.next=head;
                tempodd=tempodd.next;
                break;
            }
            tempodd.next=head;
            tempodd=tempodd.next;
            tempeven.next=head.next;
            tempeven=tempeven.next;
            head=head.next.next;
        }
        tempodd.next=even.next;
        tempeven.next=null;
        
        return odd.next;

    }
}