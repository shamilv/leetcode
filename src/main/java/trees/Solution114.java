package trees;


public class Solution114 {

    public static class TreeNode {
        int val;
        Solution114.TreeNode left;
        Solution114.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode prev;

    /**
     * not me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(1)
     */
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    /**
     * me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(1)
     */

    private TreeNode last;

    public void flatten_me(TreeNode root) {
        helper(root);

        TreeNode current = root;
        while (current != null) {
            current.right = current.left;
            current.left = null;
            current = current.right;
        }
    }

    private void helper(TreeNode node) {
        if (node == null)
            return;

        last = node;
        if (last.left != null)
            helper(last.left);

        last.left = node.right;
        last.right = null;

        helper(last.left);
    }

}
