package trees;

/**
 * me
 * easy
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution101 {

    public static class TreeNode {
        int val;
        Solution101.TreeNode left;
        Solution101.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null || node1.val != node2.val)
            return false;

        return helper(node1.left, node2.right) && helper(node1.right, node2.left);
    }
}
