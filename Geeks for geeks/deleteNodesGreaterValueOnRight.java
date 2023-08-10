class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node temp=new Node(-1);
        if(head.next==null){
            return head;
        }
        head.next=compute(head.next);
        
        if(head.next.data>head.data){
            return head.next;
            }
            
        
        return head;
    }
}