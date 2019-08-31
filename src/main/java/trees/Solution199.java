package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */
public class Solution199 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return Collections.EMPTY_LIST;
        List<Integer> buf = new ArrayList<>();
        helper(root, 0, buf);
        return buf;
    }

    private void helper(TreeNode root, int level, List<Integer> buf) {
        if (root == null)
            return;
        if (level == buf.size())
            buf.add(root.val);

        helper(root.right, level + 1, buf);
        helper(root.left, level + 1, buf);
    }
}
