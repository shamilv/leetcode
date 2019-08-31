package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution543Test {

    @Test
    public void test1() {
        Solution543.TreeNode treeNode = new Solution543.TreeNode(1);
        treeNode.left = new Solution543.TreeNode(2);
        Solution543 solution543 = new Solution543();
        int res = solution543.diameterOfBinaryTree(treeNode);

        assertEquals(1, res);
    }

    @Test
    public void test2() {
        Solution543.TreeNode treeNode = new Solution543.TreeNode(1);
        treeNode.left = new Solution543.TreeNode(2);
        treeNode.right = new Solution543.TreeNode(3);

        Solution543 solution543 = new Solution543();
        int res = solution543.diameterOfBinaryTree(treeNode);

        assertEquals(2, res);
    }

    @Test
    public void test3() {
        Solution543.TreeNode treeNode = new Solution543.TreeNode(1);
        treeNode.left = new Solution543.TreeNode(2);
        treeNode.right = new Solution543.TreeNode(3);

        treeNode.left.left = new Solution543.TreeNode(4);

        Solution543 solution543 = new Solution543();
        int res = solution543.diameterOfBinaryTree(treeNode);

        assertEquals(3, res);
    }

    @Test
    public void test4() {
        Solution543.TreeNode treeNode = new Solution543.TreeNode(1);
        treeNode.left = new Solution543.TreeNode(2);
        treeNode.right = new Solution543.TreeNode(3);

        treeNode.left.left = new Solution543.TreeNode(4);
        treeNode.left.right = new Solution543.TreeNode(5);

        treeNode.left.left.left = new Solution543.TreeNode(6);
        treeNode.left.left.right = new Solution543.TreeNode(7);

        treeNode.left.left.right.left = new Solution543.TreeNode(8);

        treeNode.left.right.right = new Solution543.TreeNode(9);
        treeNode.left.right.right.right = new Solution543.TreeNode(10);

        Solution543 solution543 = new Solution543();
        int res = solution543.diameterOfBinaryTree(treeNode);

        assertEquals(6, res);
    }

}