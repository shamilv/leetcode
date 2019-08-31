package trees;


import java.util.LinkedList;
import java.util.Queue;

/**
 * me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(1)
 */

public class Solution116 {

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null)
            return null;
        helper(root.left, root.right);

        return root;
    }

    private void helper(Node left, Node right) {
        if (left == null && right == null)
            return;
        left.next = right;

        helper(left.left, left.right);
        helper(right.left, right.right);
        helper(left.right, right.left);
    }

    public Node connect2(Node root) {
        if (root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        Node next = null;

        while (!queue.isEmpty()) {
            double cnt = Math.pow(2, level++);
            while (cnt-- > 0) {
                Node node = queue.poll();
                node.next = next;
                if (node.right != null)
                    queue.offer(node.right);
                if (node.left != null)
                    queue.offer(node.left);

                next = node;
                if (cnt == 0)
                    next = null;
            }
        }

        return root;
    }

}
