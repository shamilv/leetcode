package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * not me
 * medium
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */

public class Solution105 {
    public static class TreeNode {
        int val;
        Solution105.TreeNode left;
        Solution105.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int p_idx = 0;
    private int[] porder;
    private int[] iorder;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)
            return null;
        porder = preorder;
        iorder = inorder;
        int index = 0;
        for (int val: inorder)
            map.put(val, index++);
        return helper(0, preorder.length);
    }

    private TreeNode helper(int left_idx, int right_idx) {
        if (left_idx == right_idx)
            return null;
        int root_value = porder[p_idx++];
        int index = map.get(root_value);
        TreeNode root = new TreeNode(root_value);

        root.left = helper(left_idx, index);
        root.right = helper(index + 1, right_idx);

        return root;
    }
}
