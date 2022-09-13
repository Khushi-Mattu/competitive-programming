class Solution {
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
       diameter(root);
        return ans;
    }
    
    public int diameter(TreeNode root) {

          if(root==null)  return 0;
        
        int l = diameter(root.left);
        int r = diameter(root.right);
         //  1+leftHeight+rightHeight = diameter
		 /* 
		 but here  they take index based height 
		 means it is like 0,1,2,3 
		 and height == 3 while actually it is 4 right.
		 that's why make changes in the ans 
		 */
        ans = Math.max(ans, l+r);
        
        return 1+ Math.max(l,r);// height       
    }
}