class Solution {

public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    in(root,res);
    return res;
}

public void in(TreeNode root,List<Integer> res){
    if(root==null)
        return;
    in(root.left,res);
    res.add(root.val);
    in(root.right,res);
}
}