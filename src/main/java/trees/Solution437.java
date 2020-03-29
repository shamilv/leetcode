package trees;

import java.util.HashMap;
import java.util.Map;

public class Solution437 {

    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> d = new HashMap<>();
        d.put(0, 1);
        return helper(root, sum, d);
    }

    private int helper(TreeNode root, int sum, Map<Integer, Integer> d) {
        if (root == null)
            return 0;
        int dif = sum - root.val;
        int ans = d.getOrDefault(dif, 0);
        d.put(dif, d.getOrDefault(dif, 0) + 1);
        ans += helper(root.left, sum, d);
        ans += helper(root.right, sum, d);
        return ans;
    }
}
