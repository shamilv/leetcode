package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution114Test {

    @Test
    public void test() {
        Solution114.TreeNode treeNode = new Solution114.TreeNode(1);
        treeNode.left = new Solution114.TreeNode(2);
        treeNode.right = new Solution114.TreeNode(3);

        Solution114 solution114 = new Solution114();
        solution114.flatten(treeNode);

        assertEquals(1, treeNode.val);
        assertEquals(2, treeNode.right.val);
        assertEquals(3, treeNode.right.right.val);
    }

    @Test
    public void test2() {
        Solution114.TreeNode treeNode = new Solution114.TreeNode(1);
        treeNode.left = new Solution114.TreeNode(2);
        treeNode.left.right = new Solution114.TreeNode(3);

        treeNode.right = new Solution114.TreeNode(4);

        Solution114 solution114 = new Solution114();
        solution114.flatten(treeNode);

        assertEquals(1, treeNode.val);
        assertEquals(2, treeNode.right.val);
        assertEquals(3, treeNode.right.right.val);
        assertEquals(4, treeNode.right.right.right.val);
    }

    @Test
    public void test3() {
        Solution114.TreeNode treeNode = new Solution114.TreeNode(1);
        treeNode.left = new Solution114.TreeNode(2);
        treeNode.left.left = new Solution114.TreeNode(3);
        treeNode.left.right = new Solution114.TreeNode(4);

        treeNode.right = new Solution114.TreeNode(5);
        treeNode.right.right = new Solution114.TreeNode(6);

        Solution114 solution114 = new Solution114();
        solution114.flatten(treeNode);

        assertEquals(1, treeNode.val);
        assertEquals(2, treeNode.right.val);
        assertEquals(3, treeNode.right.right.val);
        assertEquals(4, treeNode.right.right.right.val);
        assertEquals(5, treeNode.right.right.right.right.val);
        assertEquals(6, treeNode.right.right.right.right.right.val);
    }

}