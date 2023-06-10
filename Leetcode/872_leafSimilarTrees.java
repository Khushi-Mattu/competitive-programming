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
    public void inOrder(TreeNode node,ArrayList<Integer> lis) {
    if (node == null)
      return;
    if(node.left==null && node.right==null){
        lis.add(node.val);
    }
    // traverse the left child
    inOrder(node.left,lis);
    // traverse the right child
    inOrder(node.right,lis);
  }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> lis1=new ArrayList<Integer>();
        ArrayList<Integer> lis2=new ArrayList<Integer>();
        inOrder(root1,lis1);
        inOrder(root2,lis2);
        
        if(lis1.size()!=lis2.size()){
          return false;
        }
        for(int i=0;i<lis1.size();i++){
          if(lis1.get(i)!=lis2.get(i)){
            return false;
          }
        }
        return true;

    }
}