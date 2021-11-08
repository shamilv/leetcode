import org.junit.jupiter.api.Test;
import trees.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class Solution1372Test {

    @Test
    public void test1() {
        Solution1372 solution1372 = new Solution1372();
        int ans = solution1372.longestZigZag(new TreeNode(0));
        assertEquals(0, ans);
    }

    @Test
    public void test2() {
        Solution1372 solution1372 = new Solution1372();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        int ans = solution1372.longestZigZag(root);
        assertEquals(2, ans);
    }

    @Test
    public void test3() {
        Solution1372 solution1372 = new Solution1372();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(4);
        int ans = solution1372.longestZigZag(root);
        assertEquals(2, ans);
    }

}