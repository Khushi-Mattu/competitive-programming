class Solution {
    int maxHeight = Integer.MIN_VALUE;
    int height = 0;
    int maxSum = 0;
    public int deepestLeavesSum(TreeNode root) {
        inorderDFS(root,height);
        return maxSum;
    }
    public void inorderDFS(TreeNode root, int height){
        if(root == null) return;
        height += 1;
        inorderDFS(root.left,height);
        if(root.left == null && root.right==null){ // Node is leaf
            if(maxHeight < height){
                maxHeight = height;
                maxSum = root.val;
            }
            else if(maxHeight == height){
                maxSum = maxSum + root.val;
            }
        }
        inorderDFS(root.right,height);
    }
}