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
    ArrayList<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String ans="";
        helper(root,ans);
        return list;
    }
    void helper(TreeNode root, String ans) {
        if(root==null){return;}
        ans=ans+root.val;
        if(root.left==null && root.right==null){
            list.add(ans);
            return;
        }
        ans+="->";
        helper(root.left,ans);
        helper(root.right,ans);
    }
}