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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode();
        ListNode prev=dummy;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            prev.next=cur.next;
            cur.next=prev.next.next;
            prev.next.next=cur;

            prev=cur;
            cur=cur.next;
        }
        return dummy.next;

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        // first count number of nodes in Linked List
     ListNode countNode = head;
     int count = 0;
     while(countNode != null)
     {
         count++;
         countNode = countNode.next;
     }

     // now add every node into array of Nodes;
    ListNode[] arr = new ListNode[count];
    ListNode fillIntoList = head;
    int i = 0;
    while(fillIntoList != null)
    {
        // take out the node and add it to array.  
        ListNode temp = fillIntoList;
        arr[i++] = temp;
        fillIntoList = fillIntoList.next;
    }

    // now just swap pair nodes.
    for(int index=0; index<count-1; index+=2)
    {
        ListNode temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
    }
    if(count != 0)  
        arr[count-1].next = null;
    // now just generate the new Linked List;
    ListNode newListNode = count != 0 ? arr[0] : null;
    ListNode result = newListNode;
    for(int index=1; index<count; index++)
    {
        newListNode.next = arr[index];
        newListNode = newListNode.next;
    }
    return result;

    }
}