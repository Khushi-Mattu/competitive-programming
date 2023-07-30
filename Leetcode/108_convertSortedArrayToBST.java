class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        return subtree(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int first, int last) {

        if (first > last) return null;
        int mid=(first+last)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createBST(nums,first,mid-1);
        root.right=createBST(nums,mid+1,last);
        return root;
    }
}

/*
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        return subtree(nums, 0, nums.length - 1);
    }

    private TreeNode subtree(int[] nums, int first, int last) {

        if (first > last) return null;
        if (first == last) return new TreeNode(nums[first]);

        var bias = (first + last) / 2;
        return new TreeNode(
                nums[bias],
                subtree(nums, first, bias - 1),
                subtree(nums, bias + 1, last)
        );
    }
}