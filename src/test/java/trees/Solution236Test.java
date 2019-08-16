package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution236Test {

    @Test
    public void test1() {
        Solution236.TreeNode treeNode = new Solution236.TreeNode(3);
        treeNode.left = new Solution236.TreeNode(5);
        treeNode.right = new Solution236.TreeNode(1);

        Solution236 solution236 = new Solution236();
        Solution236.TreeNode ans = solution236.lowestCommonAncestor(treeNode, treeNode.left, treeNode.right);

        assertEquals(treeNode.val, ans.val);
    }

    @Test
    public void test2() {
        Solution236.TreeNode treeNode = new Solution236.TreeNode(3);
        treeNode.left = new Solution236.TreeNode(5);
        treeNode.left.left = new Solution236.TreeNode(6);
        treeNode.left.right = new Solution236.TreeNode(2);

        treeNode.right = new Solution236.TreeNode(1);

        Solution236 solution236 = new Solution236();
        Solution236.TreeNode ans = solution236.lowestCommonAncestor(treeNode, treeNode.left.left, treeNode.left.right);

        assertEquals(treeNode.left.val, ans.val);
    }

    @Test
    public void test3() {
        Solution236.TreeNode treeNode = new Solution236.TreeNode(3);
        treeNode.left = new Solution236.TreeNode(5);
        treeNode.left.left = new Solution236.TreeNode(6);
        treeNode.left.right = new Solution236.TreeNode(2);

        treeNode.right = new Solution236.TreeNode(1);

        Solution236 solution236 = new Solution236();
        Solution236.TreeNode ans = solution236.lowestCommonAncestor(treeNode, treeNode.left.right, treeNode.right);

        assertEquals(treeNode.val, ans.val);
    }

}