/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode head1, TreeNode head2) {
        if(head1==null && head2==null){
            return null;
        }
        if(head1==null) return head2;
        if(head2==null) return head1;
        head1.val=head1.val+head2.val;
        head1.left=mergeTrees(head1.left,head2.left);
        head1.right=mergeTrees(head1.right,head2.right);
        return head1;
        
    }
}