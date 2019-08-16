package trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution545Test {

    @Test
    public void test1() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.left = new Solution545.TreeNode(2);
        treeNode.right = new Solution545.TreeNode(3);

        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 2, 3), res);
    }

    @Test
    public void test2() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.left = new Solution545.TreeNode(2);
        treeNode.right = new Solution545.TreeNode(3);

        treeNode.left.left = new Solution545.TreeNode(4);
        treeNode.left.right = new Solution545.TreeNode(5);

        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 2, 4, 5, 3), res);
    }

    @Test
    public void test3() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.right = new Solution545.TreeNode(3);

        treeNode.right.left = new Solution545.TreeNode(4);
        treeNode.right.right = new Solution545.TreeNode(5);

        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 4, 5, 3), res);
    }

    @Test
    public void test4() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.left = new Solution545.TreeNode(2);
        treeNode.right = new Solution545.TreeNode(3);

        treeNode.left.left = new Solution545.TreeNode(4);
        treeNode.left.right = new Solution545.TreeNode(5);

        treeNode.left.right.left = new Solution545.TreeNode(7);
        treeNode.left.right.right = new Solution545.TreeNode(8);

        treeNode.right.left = new Solution545.TreeNode(6);

        treeNode.right.left.left = new Solution545.TreeNode(9);
        treeNode.right.left.right = new Solution545.TreeNode(10);

        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 10, 6, 3), res);
    }

    @Test
    public void test5() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.right = new Solution545.TreeNode(2);

        treeNode.right.left = new Solution545.TreeNode(3);
        treeNode.right.right = new Solution545.TreeNode(4);


        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 3, 4, 2), res);
    }

    @Test
    public void test6() {
        Solution545.TreeNode treeNode = new Solution545.TreeNode(1);
        treeNode.left = new Solution545.TreeNode(2);
        treeNode.right = new Solution545.TreeNode(3);

        //treeNode.left.left = new Solution545.TreeNode(4);
        treeNode.left.right = new Solution545.TreeNode(4);

        treeNode.right.left = new Solution545.TreeNode(5);
        //treeNode.right.right = new Solution545.TreeNode(4);

        treeNode.left.right.left = new Solution545.TreeNode(6);
        treeNode.left.right.right = new Solution545.TreeNode(7);

        Solution545 solution545 = new Solution545();
        List<Integer> res = solution545.boundaryOfBinaryTree(treeNode);

        assertEquals(Arrays.asList(1, 2, 4, 6, 7, 5, 3), res);
    }

}