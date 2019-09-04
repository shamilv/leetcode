package treesBST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution108Test {

    @Test
    public void test1() {
        Solution108 solution108 = new Solution108();
        TreeNode treeNode = solution108.sortedArrayToBST(new int[]{-10,-3,0,5,9});

        assertEquals(0, treeNode.val);
        assertEquals(-3, treeNode.left.val);
        assertEquals(-10, treeNode.left.left.val);
        assertEquals(9, treeNode.right.val);
        assertEquals(5, treeNode.right.left.val);
    }

}