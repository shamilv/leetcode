package trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution144Test {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(1);

        Solution144 solution144 = new Solution144();
        List<Integer> res = solution144.preorderTraversal(treeNode);

        assertEquals(Arrays.asList(1), res);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        Solution144 solution144 = new Solution144();
        List<Integer> res = solution144.preorderTraversal(treeNode);

        assertEquals(Arrays.asList(1, 2, 4, 5, 3), res);
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);

        Solution144 solution144 = new Solution144();
        List<Integer> res = solution144.preorderTraversal(treeNode);

        assertEquals(Arrays.asList(1, 2, 3), res);
    }

    @Test
    public void test4() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);

        Solution144 solution144 = new Solution144();
        List<Integer> res = solution144.preorderTraversal(treeNode);

        assertEquals(Arrays.asList(1, 2, 3), res);
    }

}