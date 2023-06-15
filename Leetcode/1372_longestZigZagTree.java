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
    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root.left!=null){
            helper(root.left,1,false,true);
        }
        if(root.right!=null){
            helper(root.right,1,true,false);
        }
        return max;
    }
    public void helper(TreeNode node,int step,boolean canGoLeft,boolean canGoRight){
        max=Math.max(max,step);
        if(canGoLeft){
            if(node.left!=null){
                helper(node.left,step+1,false,true);
            }
            if(node.right!=null){
                helper(node.right,1,true,false);
            }
            
        }
        if(canGoRight){
            if(node.right!=null){
                helper(node.right,step+1,true,false);
            }
            if(node.left!=null){
                helper(node.left,1,false,true);
            }
        }
    }
    
}