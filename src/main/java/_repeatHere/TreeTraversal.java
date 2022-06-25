package _repeatHere;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeTraversal {
    public static class TreeNode {
        protected int val;
        protected TreeNode left;
        protected TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        return list;
    }

    public List<Integer> inOrderTraversalStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        putLeftNode(root, stack);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            putLeftNode(node.right, stack);
        }
        return list;
    }

    private void putLeftNode(TreeNode root, Deque<TreeNode> stack) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    private void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list);
        return list;
    }

    public List<Integer> preOrderTraversalStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        putLeftNodePreorder(root, stack, list);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            putLeftNodePreorder(node, stack, list);
        }
        return list;
    }

    private void putLeftNodePreorder(TreeNode root, Deque<TreeNode> stack, List<Integer> list) {
        while (root != null) {
            list.add(root.val);
            stack.push(root);
            root = root.left;
        }
    }

    private void preOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preOrderTraversal(root.left, list);        
        preOrderTraversal(root.right, list);
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderTraversal(root, list);
        return list;
    }

    private void postOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postOrderTraversal(root.left, list);        
        postOrderTraversal(root.right, list);
        list.add(root.val);
    }

    public List<Integer> bsd(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) continue;
            list.add(node.val);
            q.add(node.left);
            q.add(node.right);
        }
        return list;
    }
}
