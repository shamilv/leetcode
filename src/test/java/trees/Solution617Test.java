package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution617Test {

    @Test
    public void test1() {
        Solution617.TreeNode t1 = new Solution617.TreeNode(1);
        Solution617.TreeNode t2 = new Solution617.TreeNode(2);
        Solution617.TreeNode res = (new Solution617()).mergeTrees(t1, t2);

        assertEquals(3, res.val);
    }

    @Test
    public void test2() {
        Solution617.TreeNode t1 = new Solution617.TreeNode(1);
        t1.left = new Solution617.TreeNode(3);
        Solution617.TreeNode t2 = new Solution617.TreeNode(2);

        Solution617.TreeNode res = (new Solution617()).mergeTrees(t1, t2);

        assertEquals(3, res.val);
        assertEquals(3, res.left.val);
        assertNull(res.right);
    }

    @Test
    public void test3() {
        Solution617.TreeNode t1 = new Solution617.TreeNode(1);
        t1.left = new Solution617.TreeNode(7);
        t1.left.left = new Solution617.TreeNode(8);

        Solution617.TreeNode t2 = new Solution617.TreeNode(2);
        t2.right = new Solution617.TreeNode(5);
        t2.right.right = new Solution617.TreeNode(6);

        Solution617.TreeNode res = (new Solution617()).mergeTrees(t1, t2);

        assertEquals(3, res.val);
        assertEquals(7, res.left.val);
        assertEquals(8, res.left.left.val);
        assertEquals(3, res.val);
        assertEquals(5, res.right.val);
        assertEquals(6, res.right.right.val);
    }

}