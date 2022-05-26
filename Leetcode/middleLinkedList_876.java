
/*

Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
*/

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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int ans=0;
        int c=1;
        if(cnt%2!=0)
        {
            ans=(cnt+1)/2; 
            while(c!=ans)
            {
                temp=temp.next;
                c++;
            }
            return temp;
        }
        else{
            ans=cnt/2;
            ans+=1;
            while(c!=ans)
            {
                temp=temp.next;
                c++;
            }
            return temp;
            
        }
    }
}