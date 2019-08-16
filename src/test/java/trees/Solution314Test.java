package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution314Test {

    @Test
    public void testWhenNull() {
        Solution314 solution314 = new Solution314();

        List<List<Integer>> res = solution314.verticalOrder(null);

        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp, res);
    }

    @Test
    public void testWhenOnlyRoot() {
        Solution314 solution314 = new Solution314();

        Solution314.TreeNode treeNode = new Solution314.TreeNode(3);
        List<List<Integer>> res = solution314.verticalOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(3));
        assertEquals(exp, res);
    }

    @Test
    public void testWhenRootWithChilds() {
        Solution314 solution314 = new Solution314();

        Solution314.TreeNode treeNode = new Solution314.TreeNode(3);
        treeNode.left = new Solution314.TreeNode(9);
        treeNode.right = new Solution314.TreeNode(8);

        List<List<Integer>> res = solution314.verticalOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(9));
        exp.add(Arrays.asList(3));
        exp.add(Arrays.asList(8));
        assertEquals(exp, res);
    }

    @Test
    public void testRegular() {
        Solution314 solution314 = new Solution314();

        Solution314.TreeNode treeNode = new Solution314.TreeNode(3);
        treeNode.left = new Solution314.TreeNode(9);
        treeNode.right = new Solution314.TreeNode(8);

        treeNode.left.left = new Solution314.TreeNode(4);
        treeNode.left.right = new Solution314.TreeNode(0);

        treeNode.right.left = new Solution314.TreeNode(1);
        treeNode.right.right = new Solution314.TreeNode(7);

        treeNode.left.right.right = new Solution314.TreeNode(2);
        treeNode.right.left.left = new Solution314.TreeNode(5);

        List<List<Integer>> res = solution314.verticalOrder(treeNode);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(4));
        exp.add(Arrays.asList(9, 5));
        exp.add(Arrays.asList(3, 0, 1));
        exp.add(Arrays.asList(8, 2));
        exp.add(Arrays.asList(7));
        assertEquals(exp, res);
    }

}