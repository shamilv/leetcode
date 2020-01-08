package trees;

/**
 * me
 * medium
 *
 * T.C.: O(n:2)
 * S.C.: O(n)
 */

public class Solution654 {

    static class TreeNode {
        int val;
        Solution654.TreeNode left;
        Solution654.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int l = 0, r = nums.length - 1;
        return createNode(nums, l, r);
    }

    private TreeNode createNode(int[] nums, int l, int r) {
        if (l > r)
            return null;
        int idx = findMax(nums, l, r);
        TreeNode root = new TreeNode(nums[idx]);
        root.left = createNode(nums, l, idx - 1);
        root.right = createNode(nums, idx + 1, r);
        return root;
    }

    private int findMax(int[] nums, int l, int r) {
        int res = l, max = nums[l];
        for (int i = l + 1; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] arg) {
        System.out.println((3/4) + 1);
        System.out.println((6/4) + 1);
        System.out.println((11/4) + 1);
    }
}
