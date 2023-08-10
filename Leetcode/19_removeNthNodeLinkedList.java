class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head.next==null) return null;
    ListNode temp=head;
    ListNode temp2=head;
    int cnt=0;
    while(head!=null){
        cnt++;
        head=head.next;
    }
    if(n==cnt){
        return temp.next;
    }
    int c=1;
    while(c<(cnt-n)){
        temp2=temp2.next;
        c++;
    }
    temp2.next=temp2.next.next;
    return temp;
}
}

/*
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