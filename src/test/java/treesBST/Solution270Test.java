package treesBST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution270Test {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        Solution270 solution270 = new Solution270();
        int ans = solution270.closestValue(treeNode, 3.714286);

        assertEquals(4, ans);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        Solution270 solution270 = new Solution270();
        int ans = solution270.closestValue(treeNode, 5.1);

        assertEquals(5, ans);
    }

    @Test
    public void test4() {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        Solution270 solution270 = new Solution270();
        int ans = solution270.closestValue(treeNode, 3.01);

        assertEquals(3, ans);
    }


    @Test
    public void test5() {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        Solution270 solution270 = new Solution270();
        int ans = solution270.closestValue(treeNode, 1.405);

        assertEquals(1, ans);
    }

    @Test
    public void test6() {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        Solution270 solution270 = new Solution270();
        int ans = solution270.closestValue(treeNode, 0.05);

        assertEquals(1, ans);
    }


}