package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution110Test {

    @Test
    public void test1() {
        Solution110 solution110 = new Solution110();
        boolean ans = solution110.isBalanced(null);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(3);
        Solution110 solution110 = new Solution110();
        boolean ans = solution110.isBalanced(treeNode);
        assertTrue(ans);
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(30);
        treeNode.right.right = new TreeNode(40);
        Solution110 solution110 = new Solution110();
        boolean ans = solution110.isBalanced(treeNode);
        assertTrue(ans);
    }

    @Test
    public void test4() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(30);
        treeNode.right.right = new TreeNode(40);
        treeNode.right.right.right = new TreeNode(60);
        Solution110 solution110 = new Solution110();
        boolean ans = solution110.isBalanced(treeNode);
        assertFalse(ans);
    }

}