package amazon;

import java.util.ArrayList;
import java.util.List;

public class Amazon863 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, target, k, ans);
        return ans;
    }

    private int dfs(TreeNode root, TreeNode target, int k, List<Integer> ans) {
        if (root == null) return -1;
        if (root.val == target.val) {
            subTree(root, k, ans);
            return 1;
        } else {
            int L = dfs(root.left, target, k, ans);
            int R = dfs(root.right, target, k, ans);
            if (L != -1) {
                if (L == k) {
                    ans.add(root.val);
                } else {
                    subTree(root.right, k - L - 1, ans);
                }
                return L + 1;
            } else if (R != -1) {
                if (R == k) {
                    ans.add(root.val);
                } else {
                    subTree(root.left, k - R - 1, ans);
                }
                return R + 1;
            }
            return -1;
        }
    }

    private void subTree(TreeNode root, int k, List<Integer> ans) {
        if (root == null) return;
        if (k == 0) {
            ans.add(root.val);
        } else {
            subTree(root.left, k - 1, ans);
            subTree(root.right, k - 1, ans);
        }
    }
}
