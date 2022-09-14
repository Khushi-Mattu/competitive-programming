class Solution {
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        helper(root.left);
        helper(root.right);
    }
    
}