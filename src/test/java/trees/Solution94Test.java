package trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution94Test {

    @Test
    public void test1() {
        Solution94.TreeNode treeNode = new Solution94.TreeNode(1);
        Solution94 solution94 = new Solution94();
        List<Integer> inorder = solution94.inorderTraversal(treeNode);

        List<Integer> exp = Arrays.asList(1);
        assertEquals(exp, inorder);
    }

    @Test
    public void test2() {
        Solution94.TreeNode treeNode = new Solution94.TreeNode(1);
        treeNode.left = new Solution94.TreeNode(2);
        treeNode.left.left = new Solution94.TreeNode(3);

        Solution94 solution94 = new Solution94();
        List<Integer> inorder = solution94.inorderTraversal(treeNode);

        List<Integer> exp = Arrays.asList(3, 2, 1);
        assertEquals(exp, inorder);
    }

    @Test
    public void test3() {
        Solution94.TreeNode treeNode = new Solution94.TreeNode(1);
        treeNode.right = new Solution94.TreeNode(2);
        treeNode.right.right = new Solution94.TreeNode(3);

        Solution94 solution94 = new Solution94();
        List<Integer> inorder = solution94.inorderTraversal(treeNode);

        List<Integer> exp = Arrays.asList(1, 2, 3);
        assertEquals(exp, inorder);
    }

    @Test
    public void test4() {
        Solution94.TreeNode treeNode = new Solution94.TreeNode(1);
        treeNode.right = new Solution94.TreeNode(2);
        treeNode.right.left = new Solution94.TreeNode(3);

        Solution94 solution94 = new Solution94();
        List<Integer> inorder = solution94.inorderTraversal(treeNode);

        List<Integer> exp = Arrays.asList(1, 3, 2);
        assertEquals(exp, inorder);
    }

}