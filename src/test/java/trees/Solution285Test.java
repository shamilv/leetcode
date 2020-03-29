package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution285Test {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        Solution285 solution285 = new Solution285();
        TreeNode ans = solution285.inorderSuccessor(root, root);
        assertNull(ans);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        Solution285 solution285 = new Solution285();
        TreeNode ans = solution285.inorderSuccessor(root, root.left);
        assertEquals(3, ans.val);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution285 solution285 = new Solution285();
        TreeNode ans = solution285.inorderSuccessor(root, root.left.left);
        assertEquals(1, ans.val);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution285 solution285 = new Solution285();
        TreeNode ans = solution285.inorderSuccessor(root, root.left);
        assertEquals(5, ans.val);
    }

    @Test
    public void test5() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution285 solution285 = new Solution285();
        TreeNode ans = solution285.inorderSuccessor(root, root.left.right);
        assertEquals(3, ans.val);
    }

}