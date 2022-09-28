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
                subtree(nums, bias + ac1, last)
        );
    }
}