class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> set=new HashSet<Node>();
        Node prev=null;
        while(head!=null){
            if(set.contains(head)){
                prev.next=null;
            }
            else{
                prev=head;
                set.add(head);
                head=head.next;
            }
        }
    }
}

