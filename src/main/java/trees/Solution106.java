package trees;

import java.util.HashMap;
import java.util.Map;

public class Solution106 {

    public static class TreeNode {
        int val;
        Solution106.TreeNode left;
        Solution106.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int pidx = 0;
    private int[] inorder;
    private int[] postorder;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        pidx = inorder.length-1;

        int index = 0;
        for (int val: inorder)
            map.put(val, index++);
        return helper(0, inorder.length);
    }

    private TreeNode helper(int left, int right) {
        if (left == right)
            return null;

        int val = postorder[pidx--];
        int index = map.get(val);
        TreeNode node = new TreeNode(val);

        node.right = helper(index + 1, right);
        node.left = helper(left, index);

        return node;
    }
}
