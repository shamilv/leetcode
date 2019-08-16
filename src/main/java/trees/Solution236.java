package trees;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution236 {

    private TreeNode ans;

    public static class TreeNode {
        int val;
        Solution236.TreeNode left;
        Solution236.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null)
            return null;

        helper(root, p, q);

        return ans;
    }

    private boolean helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null)
            return false;

        int left = helper(node.left, p, q) ? 1 : 0;
        int right = helper(node.right, p, q) ? 1 : 0;
        int mid = 0;
        if (node.val == p.val || node.val == q.val)
            mid = 1;
        if (left + right + mid >= 2)
            ans = node;

        if (left + right + mid >= 1)
            return true;

        return false;
    }

}
