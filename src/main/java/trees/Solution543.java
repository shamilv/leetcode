package trees;

/**
 * not me
 * easy
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution543 {
    static class TreeNode {
        int val;
        Solution543.TreeNode left;
        Solution543.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return  0;
        helper(root);
        return diameter;
    }

    private int helper(TreeNode node) {
        if (node == null)
            return 0;
        int lheight = helper(node.left);
        int rheight = helper(node.right);
        diameter = Math.max(lheight + rheight, diameter);
        return Math.max(lheight, rheight) + 1;
    }
}
