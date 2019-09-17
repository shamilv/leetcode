package treesBST;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution173 {

    private Deque<TreeNode> stack = new ArrayDeque<>();

    public Solution173(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
    }

    public int next() {
        TreeNode current = stack.pop();
        int ans = current.val;
        current = current.right;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        return ans;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
