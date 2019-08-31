package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution222Test {

    @Test
    public void test1() {
        Solution222.TreeNode treeNode = new Solution222.TreeNode(1);
        treeNode.left = new Solution222.TreeNode(2);

        Solution222 solution222 = new Solution222();
        int cnt = solution222.countNodes(treeNode);

        assertEquals(2, cnt);
    }

    @Test
    public void test2() {
        Solution222.TreeNode treeNode = new Solution222.TreeNode(1);
        treeNode.left = new Solution222.TreeNode(2);
        treeNode.right = new Solution222.TreeNode(3);

        Solution222 solution222 = new Solution222();
        int cnt = solution222.countNodes(treeNode);

        assertEquals(3, cnt);
    }

    @Test
    public void test3() {
        Solution222.TreeNode treeNode = new Solution222.TreeNode(1);
        treeNode.left = new Solution222.TreeNode(2);
        treeNode.right = new Solution222.TreeNode(3);

        treeNode.left.left = new Solution222.TreeNode(4);
        treeNode.left.right = new Solution222.TreeNode(5);
        treeNode.right.left = new Solution222.TreeNode(6);

        Solution222 solution222 = new Solution222();
        int cnt = solution222.countNodes(treeNode);

        assertEquals(6, cnt);
    }

    @Test
    public void test4() {
        Solution222.TreeNode treeNode = new Solution222.TreeNode(1);
        treeNode.left = new Solution222.TreeNode(2);
        treeNode.right = new Solution222.TreeNode(3);

        treeNode.left.left = new Solution222.TreeNode(4);
        treeNode.left.right = new Solution222.TreeNode(5);
        treeNode.right.left = new Solution222.TreeNode(6);
        treeNode.right.right = new Solution222.TreeNode(7);

        Solution222 solution222 = new Solution222();
        int cnt = solution222.countNodes(treeNode);

        assertEquals(7, cnt);
    }

}