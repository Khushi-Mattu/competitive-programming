
class Solution
{
    //Function to check whether the list is palindrome.
    
    
    boolean isPalindrome(Node head) 
    {
        //Your code here
        int cnt=0;
        ArrayList<Integer> lis1=new ArrayList<Integer>();
        Node temp=head;
        while(temp!=null){
            lis1.add(temp.data);
            temp=temp.next;
            cnt++;
        }
        int i=0;int j=cnt-1;
        while(i!=j && i<j){
            if(lis1.get(i)!=lis1.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
        
    }    
}

