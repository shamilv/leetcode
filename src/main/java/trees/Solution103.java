package trees;

import java.util.*;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> levels = new ArrayList<>();
        evenLevel(root, 0, levels);
        oddLevel(root, 0, levels);
        return levels;
    }

    private void evenLevel(TreeNode root, int level, List<List<Integer>> levels) {
        if (root == null)
            return;
        if (level == levels.size())
            levels.add(new ArrayList<>());
        if (level % 2 == 0)
            levels.get(level).add(root.val);
        evenLevel(root.left, level + 1, levels);
        evenLevel(root.right, level + 1, levels);
    }

    private void oddLevel(TreeNode root, int level, List<List<Integer>> levels) {
        if (root == null)
            return;
        if (level == levels.size())
            levels.add(new ArrayList<>());
        if (level % 2 != 0)
            levels.get(level).add(root.val);
        oddLevel(root.right, level + 1, levels);
        oddLevel(root.left, level + 1, levels);
    }

    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
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
