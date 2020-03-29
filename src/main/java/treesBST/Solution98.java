package treesBST;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution98 {

    //T.C.: O(N)
    //S.C.: O(1)
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer lower, Integer upper) {
        if (root == null)
            return true;

        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(root.left, val, upper)) return false;
        if (!helper(root.right, lower, val)) return false;

        return true;
    }
}
