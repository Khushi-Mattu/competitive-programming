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
    public ListNode swapNodes(ListNode head, int k) {
        int c=0;
        ListNode temp=head;ListNode a=head,b=head;
        while(temp!=null){
            c++;
            if(c==k) a=temp;
            temp=temp.next;
        }

        temp=head;
        for(int i=1;i<=c;i++){
            if(i==(c-k+1)){
                b=temp;
                break;
            }
            temp=temp.next;
        }

        int temp2=a.val;
        a.val=b.val;
        b.val=temp2;
        return head;
    }
}