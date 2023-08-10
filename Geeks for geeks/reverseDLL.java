public static Node reverseDLL(Node  head)
{
    //Your code here
    
    if(head == null || head.next == null)
    return head;
    
    Node curr = head, prev = null;
    
    while(curr != null){
        Node next=curr.next;
        prev = curr.prev;
        curr.prev = curr.next;
        curr.next = prev;
        
        curr = next;
    }
    return prev.prev;
}