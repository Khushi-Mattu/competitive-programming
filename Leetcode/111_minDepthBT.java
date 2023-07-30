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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return depth(root);
    }

    public static int depth(TreeNode root){
        if(root.left==null && root.right==null){
            return 1;
        }
        else if(root.right==null && root.left!=null){
            return depth(root.left)+1;
        }
        else if(root.right!=null && root.left==null){
            return depth(root.right)+1;
        }
        else{
            return 1+Math.min(depth(root.left),depth(root.right));
        }
    }
}