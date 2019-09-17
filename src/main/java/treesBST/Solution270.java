package treesBST;

public class Solution270 {


    public int closestValue(TreeNode root, double target) {
        if (root == null)
            return 0;
        int closest = root.val;
        while (root != null) {
            closest = Math.abs(root.val - target) < Math.abs(closest - target) ?
                    root.val : closest;
            root = target < root.val ? root.left : root.right;
        }

        return closest;
    }

}
