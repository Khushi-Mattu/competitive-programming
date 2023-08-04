class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	Node temp=head;
	if(head==null){
	    return head;
	}
	while(head.next!=null){
	    if(head.data==head.next.data){
	        head.next=head.next.next;
	    }else{
	    head=head.next;
	    }
	}
	return temp;
    }
}
