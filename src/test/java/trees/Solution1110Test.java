package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution1110Test {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(1);

        Solution1110 solution1110 = new Solution1110();
        List<TreeNode> ans = solution1110.delNodes(treeNode, new int[]{1});

        assertEquals(new ArrayList<>(), ans);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        Solution1110 solution1110 = new Solution1110();
        List<TreeNode> ans = solution1110.delNodes(treeNode, new int[]{3, 5});

        assertEquals(1, ans.get(0).val);
        assertEquals(6, ans.get(1).val);
        assertEquals(7, ans.get(2).val);
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        Solution1110 solution1110 = new Solution1110();
        List<TreeNode> ans = solution1110.delNodes(treeNode, new int[]{5, 1});

        assertEquals(2, ans.get(0).val);
        assertEquals(3, ans.get(1).val);
    }

}