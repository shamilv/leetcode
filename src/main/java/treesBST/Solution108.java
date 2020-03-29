package treesBST;

/**
 * me
 * medium
 *
 * T.C.: O(N)
 * S.C.: O(1)
 */

public class Solution108 {

    //T.C.: O(N)
    //S.C.: O(1)
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int mid = low + (int)Math.round((high-low)/2.0);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, low, mid - 1);
        root.right = buildTree(nums, mid + 1, high);
        return root;
    }
}
