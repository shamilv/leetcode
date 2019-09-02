package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution103Test {

    @Test
    public void regular1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(31);
        root.left.right = new TreeNode(32);

        root.right.left = new TreeNode(61);
        root.right.right = new TreeNode(62);

        root.left.left.left = new TreeNode(41);
        root.left.left.right = new TreeNode(42);

        root.right.left.left = new TreeNode(71);
        root.right.left.right = new TreeNode(72);

        Solution103 solution103 = new Solution103();
        List<List<Integer>> res = solution103.zigzagLevelOrder(root);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(3));
        exp.add(Arrays.asList(6, 5));
        exp.add(Arrays.asList(31, 32, 61, 62));
        exp.add(Arrays.asList(72, 71, 42, 41));
        assertEquals(exp, res);
    }

    @Test
    public void regular2() {
       TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = null;

        root.right.left = null;
        root.right.right = new TreeNode(5);

        Solution103 solution103 = new Solution103();
        List<List<Integer>> res = solution103.zigzagLevelOrder(root);

        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1));
        exp.add(Arrays.asList(3, 2));
        exp.add(Arrays.asList(4, 5));
        assertEquals(exp, res);
    }

}