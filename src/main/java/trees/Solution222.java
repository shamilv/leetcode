package trees;

/**
 * not me
 * medium
 *
 * T.C.: O(d^2), where d is a tree depth
 * S.C.: O(1)
 */

public class Solution222 {

    static class TreeNode {
        int val;
        Solution222.TreeNode left;
        Solution222.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return -1;
        int depth = calcDepth(root);
        if (depth == 0)
            return 1;
        int l = 0;
        int r = (int) (Math.pow(2, depth) - 1);
        int idx = -1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            boolean found = isExist(root, mid, depth);
            if (found) {
                idx = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }

        return (int) Math.pow(2, depth) + idx;
    }

    private int calcDepth(TreeNode root) {
        int depth = 0;
        while (root.left != null) {
            depth++;
            root = root.left;
        }
        return depth;
    }

    private boolean isExist(TreeNode root, int idx, int height) {
        if (height == 0)
            return root != null;

        int mid = (int) (Math.pow(2, height)/2);
        if (idx < mid)
            return isExist(root.left, idx, height - 1);
        else
            return isExist(root.right, idx - mid, height - 1);
    }
}
