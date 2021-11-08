import trees.TreeNode;

public class Solution1372 {
    private int max = 0;
    public int longestZigZag(TreeNode root) {
        zigZag(root, 0);
        return max;
    }

    private int zigZag(TreeNode root, int flag) {
        if (root == null) return 0;
        int x = zigZag(root.right, 1);
        int y = zigZag(root.left, 0);
        max = Math.max(max, Math.max(x, y));
        if (flag == 1) {
            return y + 1;
        } else {
            return x + 1;
        }
    }
}


