package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution654Test {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 5, 3};
        Solution654 solution654 = new Solution654();
        Solution654.TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);

        assertEquals(5, treeNode.val);
        assertEquals(1, treeNode.left.val);
        assertEquals(3, treeNode.right.val);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 5, 2, 3};
        Solution654 solution654 = new Solution654();
        Solution654.TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);

        assertEquals(5, treeNode.val);
        assertEquals(1, treeNode.left.val);
        assertEquals(3, treeNode.right.val);
        assertEquals(2, treeNode.right.left.val);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 5, 2, 3, 0};
        Solution654 solution654 = new Solution654();
        Solution654.TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);

        assertEquals(5, treeNode.val);
        assertEquals(1, treeNode.left.val);
        assertEquals(3, treeNode.right.val);
        assertEquals(2, treeNode.right.left.val);
        assertEquals(0, treeNode.right.right.val);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 4, 5, 2, 3, 0};
        Solution654 solution654 = new Solution654();
        Solution654.TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);

        assertEquals(5, treeNode.val);

        assertEquals(4, treeNode.left.val);
        assertEquals(1, treeNode.left.left.val);

        assertEquals(3, treeNode.right.val);
        assertEquals(2, treeNode.right.left.val);
        assertEquals(0, treeNode.right.right.val);
    }

    @Test
    public void test5() {
        int[] nums = new int[]{4, 1, 5, 2, 3, 0};
        Solution654 solution654 = new Solution654();
        Solution654.TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);

        assertEquals(5, treeNode.val);

        assertEquals(4, treeNode.left.val);
        assertEquals(1, treeNode.left.right.val);

        assertEquals(3, treeNode.right.val);
        assertEquals(2, treeNode.right.left.val);
        assertEquals(0, treeNode.right.right.val);
    }

}