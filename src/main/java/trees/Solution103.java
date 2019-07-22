package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution103 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Deque<TreeNode> deq = new ArrayDeque<>();
        deq.addLast(root);
        boolean fromLeft = true;
        while (!deq.isEmpty()) {
            List<Integer> vals = new ArrayList<>();
            int cnt = deq.size();
            while (cnt-- > 0) {
                TreeNode node;
                if (fromLeft) {
                    node = deq.pollLast();
                    if (node.left != null)
                        deq.addFirst(node.left);
                    if (node.right != null)
                        deq.addFirst(node.right);
                } else {
                    node = deq.pollFirst();
                    if (node.right != null)
                        deq.addLast(node.right);
                    if (node.left != null)
                        deq.addLast(node.left);
                }
                vals.add(node.val);
            }
            res.add(vals);
            fromLeft = !fromLeft;
        }

        return res;
    }
}
