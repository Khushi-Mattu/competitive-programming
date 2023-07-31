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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(true,root.left);
        helper(false,root.right);
        return sum;
    }

    public void helper(boolean flag,TreeNode root){
        if(root==null) return;
        if(flag && root.left==null && root.right==null){
            sum+=root.val;
        }
        helper(true,root.left);
        helper(false,root.right);
    }
}