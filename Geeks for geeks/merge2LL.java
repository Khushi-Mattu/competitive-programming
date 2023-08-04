
class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     if(head1!=null && head2!=null){
         if(head1.data<head2.data){
             head1.next=sortedMerge(head1.next,head2);
             return head1;
         }
         else{
             head2.next=sortedMerge(head1,head2.next);
             return head2;
         }
     }
     if(head1==null){
         return head2;
     }
     return head1;
    
   } 
}
