package trees;

import java.util.*;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(m), where m is to_delete size
 */

public class Solution1110 {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null)
            return Collections.emptyList();

        HashSet<Integer> toDel = new HashSet<>();
        for (int n: to_delete)
            toDel.add(n);
        List<TreeNode> ans = new ArrayList<>();

        delete(root, true, toDel, ans);
        return ans;
    }

    private boolean delete(TreeNode root, boolean isRoot, Set<Integer> toDel, List<TreeNode> ans) {
        if (root == null)
            return false;
        boolean deleted = toDel.contains(root.val);
        if (isRoot && !deleted)
            ans.add(root);

        root.left = delete(root.left, deleted, toDel, ans) ? null : root.left;
        root.right = delete(root.right, deleted, toDel, ans) ? null : root.right;

        return deleted;
    }

    /*private TreeNode delete2(TreeNode root, TreeNode parent, int K, List<TreeNode> ans) {
        if (root == null)
            return null;
        if (root.val == K) {
            if (root.left != null)
                ans.add(root.left);
            if (root.right != null)
                ans.add(root.right);
            if (parent != null) {
                parent.left = parent.left == root ? null : parent.left;
                parent.right = parent.right == root ? null : parent.right;
            }
            return root;
        } else {
            TreeNode deleted = delete(root.left, root, K, ans);
            if (deleted == null)
                deleted = delete(root.right, root, K, ans);
            return deleted;
        }
    }*/
}
