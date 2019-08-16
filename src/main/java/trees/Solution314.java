package trees;

import java.util.*;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution314 {

    public static class TreeNode {
        int val;
        Solution314.TreeNode left;
        Solution314.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null)
            return Collections.EMPTY_LIST;
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = 0;
        queue.offer(root);
        cols.put(root.val, 0);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            Integer col = cols.get(node.val);
            if (!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
                cols.put(node.left.val, col - 1);
            }

            if (node.right != null) {
                queue.offer(node.right);
                cols.put(node.right.val, col + 1);
            }

            min = Math.min(min, col);
        }

        List<List<Integer>> res = new ArrayList<>();
        while (map.containsKey(min))
            res.add(map.get(min++));

        return res;
    }

}
