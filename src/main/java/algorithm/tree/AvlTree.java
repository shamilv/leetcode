package algorithm.tree;

public class AvlTree {
    public static class Node {
        protected int val;
        protected int height;
        protected Node left;
        protected Node right;
        public Node(int val) {
            this.val = val;
        }
        protected void calcHeight() {
            height = left != null ? left.height + 1 : 0;
            height = right != null ? Math.max(height, right.height + 1) : height;
        }
    }

    private Node root;

    public Node add(int val) {
        root = addNode(root, val);
        return root;
    }

    private Node addNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            if (root.val > val) {
                root.left = addNode(root.left, val);
            } else if (root.val < val) {
                root.right = addNode(root.right, val);
            }
        }
        return reballance(root);
    }

    private int height(Node root) {
        return root == null ? -1 : root.height;
    }

    private Node reballance(Node root) {
        root.calcHeight();
        int leftHeight = root.left != null ? root.left.height + 1 : 0;
        int rightHeight = root.right != null ? root.right.height + 1 : 0;
        int balance = rightHeight - leftHeight;
        if (balance > 1) {
            if (height(root.right.right) > height(root.right.left)) {
                root = rotateLeft(root);
            } else {
                root.right = rotateRight(root.right);
                root = rotateLeft(root);
            }
        } else if (balance < -1) {
            if (height(root.left.left) > height(root.left.right)) {
                root = rotateRight(root);
            } else {
                root.left = rotateLeft(root.left);
                root = rotateRight(root);
            }
        }
        return root;
    }

    private Node rotateLeft(Node root) {
        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        newRoot.left.calcHeight();
        newRoot.calcHeight();
        return newRoot;
    }

    private Node rotateRight(Node root) {
        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        newRoot.right.calcHeight();
        newRoot.calcHeight();
        return newRoot;
    }

}
