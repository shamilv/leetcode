package trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution199Test {

    @Test
    public void test1() {
        Solution199.TreeNode treeNode = new Solution199.TreeNode(1);

        Solution199 solution199 = new Solution199();
        List<Integer> res = solution199.rightSideView(treeNode);

        assertEquals(Arrays.asList(1), res);
    }

    @Test
    public void test2() {
        Solution199.TreeNode treeNode = new Solution199.TreeNode(1);
        treeNode.left = new Solution199.TreeNode(2);
        treeNode.right = new Solution199.TreeNode(3);


        Solution199 solution199 = new Solution199();
        List<Integer> res = solution199.rightSideView(treeNode);

        assertEquals(Arrays.asList(1, 3), res);
    }

    @Test
    public void test3() {
        Solution199.TreeNode treeNode = new Solution199.TreeNode(1);
        treeNode.left = new Solution199.TreeNode(2);
        treeNode.right = new Solution199.TreeNode(3);

        treeNode.left.right = new Solution199.TreeNode(4);


        Solution199 solution199 = new Solution199();
        List<Integer> res = solution199.rightSideView(treeNode);

        assertEquals(Arrays.asList(1, 3, 4), res);
    }

    @Test
    public void test4() {
        Solution199.TreeNode treeNode = new Solution199.TreeNode(1);
        treeNode.left = new Solution199.TreeNode(2);
        treeNode.right = new Solution199.TreeNode(3);

        treeNode.left.left = new Solution199.TreeNode(4);


        Solution199 solution199 = new Solution199();
        List<Integer> res = solution199.rightSideView(treeNode);

        assertEquals(Arrays.asList(1, 3, 4), res);
    }

    @Test
    public void test5() {
        Solution199.TreeNode treeNode = new Solution199.TreeNode(1);
        treeNode.left = new Solution199.TreeNode(2);
        treeNode.right = new Solution199.TreeNode(3);

        treeNode.left.left = new Solution199.TreeNode(4);

        treeNode.right.right = new Solution199.TreeNode(5);


        Solution199 solution199 = new Solution199();
        List<Integer> res = solution199.rightSideView(treeNode);

        assertEquals(Arrays.asList(1, 3, 5), res);
    }

}