package amazon;

public class Amazon1120 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private double maxAvg = 0;

    public double maximumAverageSubtree(TreeNode root) {
        dfs(root);
        return maxAvg;
    }

    private int[] dfs(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int totalVal = root.val + left[0] + right[0];
        int totalCnt = 1 + left[1] + right[1];
        maxAvg = Math.max(maxAvg, ((1.0)*totalVal/totalCnt));
        return new int[]{totalVal, totalCnt};
    }
}
