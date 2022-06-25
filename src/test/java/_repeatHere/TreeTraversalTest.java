package _repeatHere;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TreeTraversalTest {

    @Test
    public void test1() {
        TreeTraversal.TreeNode root = new TreeTraversal.TreeNode(1);
        root.left = new TreeTraversal.TreeNode(2);
        root.right = new TreeTraversal.TreeNode(3);

        root.left.left = new TreeTraversal.TreeNode(4);
        root.left.right = new TreeTraversal.TreeNode(5);

        root.right.left = new TreeTraversal.TreeNode(6);
        root.right.right = new TreeTraversal.TreeNode(7);
        
        TreeTraversal traversal = new TreeTraversal();
        List<Integer> ans = traversal.inOrderTraversal(root);
        assertEquals(Arrays.asList(4,2,5,1,6,3,7), ans);

        ans = traversal.inOrderTraversalStack(root);
        assertEquals(Arrays.asList(4,2,5,1,6,3,7), ans);
    }

    @Test
    public void test2() {
        TreeTraversal.TreeNode root = new TreeTraversal.TreeNode(1);
        root.left = new TreeTraversal.TreeNode(2);
        root.right = new TreeTraversal.TreeNode(3);

        root.left.left = new TreeTraversal.TreeNode(4);
        root.left.right = new TreeTraversal.TreeNode(5);

        root.right.left = new TreeTraversal.TreeNode(6);
        root.right.right = new TreeTraversal.TreeNode(7);
        
        TreeTraversal traversal = new TreeTraversal();
        List<Integer> ans = traversal.preOrderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), ans);

        ans = traversal.preOrderTraversalStack(root);
        assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), ans);
    }

    @Test
    public void test3() {
        TreeTraversal.TreeNode root = new TreeTraversal.TreeNode(1);
        root.left = new TreeTraversal.TreeNode(2);
        root.right = new TreeTraversal.TreeNode(3);

        root.left.left = new TreeTraversal.TreeNode(4);
        root.left.right = new TreeTraversal.TreeNode(5);

        root.right.left = new TreeTraversal.TreeNode(6);
        root.right.right = new TreeTraversal.TreeNode(7);
        
        TreeTraversal traversal = new TreeTraversal();
        List<Integer> ans = traversal.postOrderTraversal(root);
        assertEquals(Arrays.asList(4, 5, 2, 6, 7, 3, 1), ans);
    }

    @Test
    public void test4() {
        TreeTraversal.TreeNode root = new TreeTraversal.TreeNode(1);
        root.left = new TreeTraversal.TreeNode(2);
        root.right = new TreeTraversal.TreeNode(3);

        root.left.left = new TreeTraversal.TreeNode(4);
        root.left.right = new TreeTraversal.TreeNode(5);

        root.right.left = new TreeTraversal.TreeNode(6);
        root.right.right = new TreeTraversal.TreeNode(7);
        
        TreeTraversal traversal = new TreeTraversal();
        List<Integer> ans = traversal.bsd(root);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), ans);
    }

    @Test
    public void test5() {
        TreeTraversal.TreeNode root = new TreeTraversal.TreeNode(1);
        root.left = new TreeTraversal.TreeNode(2);
        root.right = new TreeTraversal.TreeNode(3);

        root.left.left = new TreeTraversal.TreeNode(4);
        root.left.right = new TreeTraversal.TreeNode(5);

        //root.right.left = new TreeTraversal.TreeNode(6);
        root.right.right = new TreeTraversal.TreeNode(6);

        root.left.left.left = new TreeTraversal.TreeNode(7);
        root.left.left.right = new TreeTraversal.TreeNode(8);

        root.left.right.left = new TreeTraversal.TreeNode(9);
        root.left.right.right = new TreeTraversal.TreeNode(10);

        root.right.right.left = new TreeTraversal.TreeNode(11);
        root.right.right.right = new TreeTraversal.TreeNode(12);
        
        TreeTraversal traversal = new TreeTraversal();
        List<Integer> ans = traversal.bsd(root);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), ans);
    }
}