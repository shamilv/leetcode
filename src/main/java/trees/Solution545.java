package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution545 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (!isLeaf(root))
            res.add(root.val);
        TreeNode t = root.left;
        while (t != null) {
            if (!isLeaf(t))
                res.add(t.val);
            if (t.left == null)
                t = t.right;
            else
                t = t.left;
        }
        addLeaf(root, res);
        LinkedList<Integer> stack = new LinkedList<>();
        t = root.right;
        while (t != null) {
            if (!isLeaf(t))
                stack.push(t.val);
            if (t.right == null)
                t = t.left;
            else
                t = t.right;
        }
        while (!stack.isEmpty())
            res.add(stack.pop());

        return res;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private void addLeaf(TreeNode node, List<Integer> res) {
        if (node == null)
            return;
        if (isLeaf(node))
            res.add(node.val);
        else {
            addLeaf(node.left, res);
            addLeaf(node.right, res);
        }
    }

}
