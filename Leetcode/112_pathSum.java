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
    private int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(helper(root,targetSum)) return true;
        return false;
    }
    private boolean helper(TreeNode root, int target){
        if(root==null) return false;
       
        if(root.left==null && root.right==null && root.val==target){return true;}
        return helper(root.left,target-root.val) || helper(root.right,target-root.val);
        
    }
}