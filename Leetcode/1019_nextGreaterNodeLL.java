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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int[] ans=new int[length];
        int[] arr=new int[length];
        temp=head;
        for(int i=0;i<length;i++){
            arr[i]=temp.val;
            ans[i]=0;
            temp=temp.next;

        }
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }




        return ans;
    }
}