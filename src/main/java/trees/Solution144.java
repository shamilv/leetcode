package trees;

import java.util.*;

public class Solution144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return Collections.EMPTY_LIST;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        List<Integer> res = new ArrayList<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                res.add(current.val);
                if (current.right != null)
                    stack.push(current.right);
                current = current.left;
            }

            if (!stack.isEmpty())
                current = stack.pop();
        }
        return res;
    }
}
