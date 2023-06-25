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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int maxSum=Integer.MIN_VALUE;int level=1;int maxLevel=1;
        queue.add(root);
       while (!queue.isEmpty()) {
           int levelSum=0;
           int levelSize=queue.size();
           for(int i=0;i<levelSize;i++){
           
           TreeNode temp = queue.poll();
           levelSum+=temp.val;

           /*add left child to the queue */
           if (temp.left != null) {
               queue.add(temp.left);
           }

           /*add right right child to the queue */
           if (temp.right != null) {
               queue.add(temp.right);
           }
           }
           if(levelSum>maxSum){
               maxSum=levelSum;
               maxLevel=level;
               
           }
           level++;
       }
       return maxLevel;

        
    }
}