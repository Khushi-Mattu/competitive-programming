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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList();
        if(root==null){return ans;}
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int c=q.size();
            for(int i=0;i<c;i++){
                TreeNode current=q.poll();
                l.add(current.val);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }

            }
            if(level%2==0){
                List<Integer> ll=new ArrayList<>();
                for(int i=l.size()-1;i>=0;i--){
                    ll.add(l.get(i));
                }
                ans.add(ll);
            }
            else{
                ans.add(l);
            }
            level++;

        }

        return ans;
    }
}
