package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

    public static class TreeNode {
        int val;
        Solution102.TreeNode left;
        Solution102.TreeNode right;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null)
            return levels;

        helper(levels, root, 0);
        return levels;
    }

    private void helper(List<List<Integer>> levels, TreeNode root, int height) {
        if (root == null)
            return;
        if (levels.size() - 1 < height) {
            levels.add(new ArrayList<>());
        }
        levels.get(height).add(root.val);
        helper(levels, root.left, height + 1);
        helper(levels, root.right, height + 1);
    }

    /**
     * me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(n)
     */

    public List<List<Integer>> levelOrder_meBetter(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null)
            return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int toWrite = 1, toRead = 0;

        while (!queue.isEmpty()) {
            List<Integer> nodes = new ArrayList<>();
            while (toWrite > 0) {
                TreeNode node = queue.poll();
                nodes.add(node.val);
                toWrite--;

                if (node.left != null) {
                    toRead++;
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    toRead++;
                    queue.offer(node.right);
                }
            }
            levels.add(nodes);
            toWrite = toRead;
            toRead = 0;
        }

        return levels;
    }

    /**
     * me
     * medium
     *
     * T.C.: O(n)
     * S.C.: O(n)
     */

    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null)
            return levels;

        Map<Integer, List<TreeNode>> map = new HashMap<>();
        int level = 0;
        List<TreeNode> list = map.getOrDefault(level, new ArrayList<>());
        list.add(root);
        map.put(level, list);

        while (map.containsKey(level)) {
            List<TreeNode> nodes = new ArrayList<>();
            for (TreeNode node: map.get(level)) {
                if (node.left != null)
                    nodes.add(node.left);
                if (node.right != null)
                    nodes.add(node.right);
            }
            if (!nodes.isEmpty())
                map.put(level + 1, nodes);
            level++;
        }

        for (int i = 0; i < level; i++) {
            List<Integer> values = map.get(i)
                    .stream()
                    .map(n -> n.val)
                    .collect(Collectors.toList());
            levels.add(values);
        }
        return levels;
    }*/
}
