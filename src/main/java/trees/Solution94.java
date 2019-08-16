package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution94 {

    public static class TreeNode {
        int val;
        Solution94.TreeNode left;
        Solution94.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * not me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(n)
     */

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root == null)
            return nodes;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            nodes.add(current.val);
            current = current.right;
        }
        return nodes;
    }

    /**
     * me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(n)
     */

    public List<Integer> inorderTraversal_me(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root == null)
            return nodes;
        Deque<TreeNode> lnodes = new ArrayDeque<>();
        Deque<TreeNode> rnodes = new ArrayDeque<>();
        lnodes.push(root);

        while (!lnodes.isEmpty()) {
            TreeNode node = lnodes.pop();
            if (node.left != null) {
                lnodes.push(node.left);
                rnodes.push(node);
            } else {
                nodes.add(node.val);
                if (node.right != null) {
                    lnodes.push(node.right);
                } else {
                    while (!rnodes.isEmpty()) {
                        node = rnodes.pop();
                        nodes.add(node.val);
                        if (node.right != null) {
                            lnodes.push(node.right);
                            break;
                        }
                    }
                }
            }
        }
        return nodes;
    }
}
