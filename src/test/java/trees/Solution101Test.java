package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution101Test {

    @Test
    public void test1() {
        Solution101 solution101 = new Solution101();
        boolean res = solution101.isSymmetric(null);
        assertTrue(res);
    }

    @Test
    public void test2() {
        Solution101 solution101 = new Solution101();

        Solution101.TreeNode treeNode = new Solution101.TreeNode(1);
        treeNode.left = new Solution101.TreeNode(2);
        treeNode.right = new Solution101.TreeNode(2);

        boolean res = solution101.isSymmetric(treeNode);
        assertTrue(res);
    }

    @Test
    public void test3() {
        Solution101 solution101 = new Solution101();

        Solution101.TreeNode treeNode = new Solution101.TreeNode(1);
        treeNode.left = new Solution101.TreeNode(2);
        treeNode.right = new Solution101.TreeNode(2);

        treeNode.left.right = new Solution101.TreeNode(3);
        treeNode.right.left = new Solution101.TreeNode(3);

        boolean res = solution101.isSymmetric(treeNode);
        assertTrue(res);
    }

    @Test
    public void test4() {
        Solution101 solution101 = new Solution101();

        Solution101.TreeNode treeNode = new Solution101.TreeNode(1);
        treeNode.left = new Solution101.TreeNode(2);
        treeNode.right = new Solution101.TreeNode(2);

        treeNode.left.left = new Solution101.TreeNode(3);
        treeNode.left.right = new Solution101.TreeNode(4);
        treeNode.right.left = new Solution101.TreeNode(4);
        treeNode.right.right = new Solution101.TreeNode(3);

        boolean res = solution101.isSymmetric(treeNode);
        assertTrue(res);
    }
}