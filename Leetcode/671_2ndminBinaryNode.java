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
    
    
        int min;
        long res = Long.MAX_VALUE;

        public void dfs(TreeNode root) {
            if (root != null) {
                
                if (min < root.val && root.val < res) {
                    res = root.val;
                } else if (min == root.val){
                    dfs(root.left);
                    dfs(root.right);
                }

            }
        }

        public int findSecondMinimumValue(TreeNode root) {
            if (root == null) return -1;
            //root.val = min(root.left.val, root.right.val) always holds.
            min = root.val;
            dfs(root);
            return res < Long.MAX_VALUE ? (int) res : -1;
        }
}

/**
 * 
 * my solution
 * 
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
 
class Solution {
    
    public void traversal(TreeNode root,HashSet<Integer> set){
        if(root==null) return;
        traversal(root.left,set);
        set.add(root.val);
        traversal(root.right,set);
    }
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set=new HashSet<>();
        //if(root==null) return;
        traversal(root,set);
        List<Integer> lis=new ArrayList<>(set);
        Collections.sort(lis);
        
        for(int i=0;i<lis.size();i++){
            System.out.println(lis.get(i));
        }
        if(lis.size()==0){
            return -1;
        }
        if(lis.size()==1){
            return -1;
        }
        return lis.get(1);
    }
}