
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode slow=head,fast=head,prev=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }

/*
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode temp=head;
        ListNode temp2=head;
        int n=0;
        while(temp2!=null){
            n++;
            temp2=temp2.next;
            
        }
        if(n==1){
            return head.next;
        }
        int c=0;
        while(c<n/2){
            if(c==n/2-1){
                temp.next=temp.next.next;
                break;
            }
            c++;
            temp=temp.next;
        }
        return head;
    }
}