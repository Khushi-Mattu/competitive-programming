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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];
        int top=0;int left=0;int bottom=m-1;int right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(head==null){
                    matrix[top][i]=-1;
                }
                else{
                    matrix[top][i]=head.val;
                    head=head.next;
                }
                
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(head==null){
                    matrix[i][right]=-1;
                }
                else{
                    matrix[i][right]=head.val;
                    head=head.next;
                }
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(head==null){
                    matrix[bottom][i]=-1;
                }
                else{
                    matrix[bottom][i]=head.val;
                    head=head.next;
                }
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    if(head==null){
                    matrix[i][left]=-1;
                }
                else{
                    matrix[i][left]=head.val;
                    head=head.next;
                }
                }
                left++;
            }

        }
        return matrix;
    }
}