package companies.google;

public class Google2096 {

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

    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca = lca(root, startValue, destValue);
        StringBuilder start = new StringBuilder();
        StringBuilder dest = new StringBuilder();
        dfs(lca, startValue, "U", "U", start);
        dfs(lca, destValue, "L", "R", dest);
        return start.toString() + dest.toString();
    }
    
    private TreeNode lca(TreeNode root, int startValue, int destValue) {
        if (root == null) return null;
        
        if (root.val == startValue || root.val == destValue) return root;
        
        TreeNode left = lca(root.left, startValue, destValue);
        TreeNode right = lca(root.right, startValue, destValue);
        
        if (left != null && right != null) return root;
        
        return left != null ? left : right;
    }
    
    private boolean dfs(TreeNode root, int val, String left, String right, StringBuilder builder) {
        if (root == null) return false;
        if (root.val == val) return true;
        
        builder.append(left);
        if (dfs(root.left, val, left, right, builder)) {
            return true;
        }
        builder.deleteCharAt(builder.length() - 1);
        
        builder.append(right);
        if (dfs(root.right, val, left, right, builder)) {
            return true;
        }
        builder.deleteCharAt(builder.length() - 1);
        
        return false;
    }

}