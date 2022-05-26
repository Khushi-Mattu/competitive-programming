class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;
    
    while(n > 0) {
        n--;
        fast = fast.next;
    }
    while(fast != null && fast.next!= null) {
        slow = slow.next;
        fast = fast.next;
    }
    if(fast == null) {        //if node to remove is head
        return head.next;
    }
    else {
        slow.next = slow.next.next;
    }
    
    
    return head;
    
}
}