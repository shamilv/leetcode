package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution102Test {

    @Test
    public void test1() {
        Solution102.TreeNode treeNode = new Solution102.TreeNode(3);

        Solution102 solution102 = new Solution102();
        List<List<Integer>> res = solution102.levelOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(3));
        assertEquals(exp, res);
    }

    @Test
    public void test2() {
        Solution102.TreeNode treeNode = new Solution102.TreeNode(3);
        treeNode.left = new Solution102.TreeNode(10);
        treeNode.right = new Solution102.TreeNode(20);

        treeNode.right.left = new Solution102.TreeNode(21);
        treeNode.right.right = new Solution102.TreeNode(22);

        Solution102 solution102 = new Solution102();
        List<List<Integer>> res = solution102.levelOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(3));
        exp.add(Arrays.asList(10, 20));
        exp.add(Arrays.asList(21, 22));
        assertEquals(exp, res);
    }

    @Test
    public void test3() {
        Solution102.TreeNode treeNode = new Solution102.TreeNode(3);
        treeNode.left = new Solution102.TreeNode(10);
        treeNode.left.right = new Solution102.TreeNode(5);


        treeNode.right = new Solution102.TreeNode(20);

        treeNode.right.left = new Solution102.TreeNode(21);
        treeNode.right.right = new Solution102.TreeNode(22);

        Solution102 solution102 = new Solution102();
        List<List<Integer>> res = solution102.levelOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(3));
        exp.add(Arrays.asList(10, 20));
        exp.add(Arrays.asList(5, 21, 22));
        assertEquals(exp, res);
    }

}