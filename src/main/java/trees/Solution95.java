package trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution95 {

    public List<TreeNode> generateTrees(int n) {
        if (n <= 0)
            return Collections.emptyList();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> ans = new LinkedList<>();
        if (start > end) {
            ans.add(null);
            return ans;
        }
        if (start == end) {
            TreeNode node = new TreeNode(start);
            ans.add(node);
            return ans;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = generateTrees(start, i - 1);
            List<TreeNode> rights = generateTrees(i + 1, end);
            for (TreeNode left: lefts) {
                for (TreeNode right: rights) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
