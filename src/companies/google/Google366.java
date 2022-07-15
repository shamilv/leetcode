package google;

import java.util.ArrayList;
import java.util.List;

public class Google366 {
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

    private List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> findLeaves(TreeNode root) {
        getHeight(root);
        return ans;
    }
                
    private int getHeight(TreeNode root) {
        if (root == null) return -1;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int height = 1 + Math.max(leftHeight, rightHeight);
        
        if (ans.size() == height) {
            ans.add(new ArrayList<>());
        }
        ans.get(height).add(root.val);
        
        return height;
    }
}
