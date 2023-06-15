
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return helper(root,targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    private int helper(TreeNode root, long sum){
        if(root == null) return 0;
        return(sum - root.val == 0 ? 1:0) + helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }
}