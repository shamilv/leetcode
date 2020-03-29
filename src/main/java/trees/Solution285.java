package trees;

import java.util.Stack;

public class Solution285 {

    //T.C.: O(N)
    //S.C.: O(1)
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        return helper(root, p, null);
    }

    private TreeNode helper(TreeNode root, TreeNode p, TreeNode prev) {
        if (root == null)
            return null;
        if (root.val == p.val) {
            root = root.right;
            while (root != null && root.left != null)
                root = root.left;
            return root != null ? root : prev;
        }
        TreeNode left = helper(root.left, p, root);
        if (left == null)
            return helper(root.right, p, prev);
        return left;
    }

    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        Stack<TreeNode> s = new Stack<>();
        boolean found = false;
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.add(root);
                root = root.left;
            }

            root = !s.isEmpty() ? s.pop() : root;
            if (found)
                return root;
            if (root.val == p.val)
                found = true;
            root = root.right;
        }
        return root;
    }

}
