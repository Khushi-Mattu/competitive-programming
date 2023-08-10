class Tree
{
    public boolean isBalanced(Node root) {
        if(root==null){return true;}
        if(height(root)==-1){return false;}
        return true;
    }
    public int height(Node root){
        if(root==null){return 0;}
        int left=height(root.left);
        int right=height(root.right);
        if(left==-1|| right==-1 || Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
