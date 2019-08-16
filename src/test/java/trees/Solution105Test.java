package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution105Test {

    @Test
    public void testWhenNull() {
        Solution105 solution105 = new Solution105();
        Solution105.TreeNode res = solution105.buildTree(null, null);
        assertNull(res);
    }

    @Test
    public void testRootOnly() {
        Solution105 solution105 = new Solution105();
        int[] preorder = new int[]{3};
        int[] inorder = new int[]{3};

        Solution105.TreeNode res = solution105.buildTree(preorder, inorder);

        assertEquals(3, res.val);
        assertNull(res.left);
        assertNull(res.right);
    }

    @Test
    public void testSimple() {
        Solution105 solution105 = new Solution105();
        int[] preorder = new int[]{3, 9, 20};
        int[] inorder = new int[]{9, 3, 20};

        Solution105.TreeNode res = solution105.buildTree(preorder, inorder);

        assertEquals(3, res.val);
        assertEquals(9, res.left.val);
        assertEquals(20, res.right.val);
    }

    @Test
    public void testNormal() {
        Solution105 solution105 = new Solution105();
        int[] preorder = new int[]{3, 9, 10, 5, 20, 7};
        int[] inorder = new int[]{10, 9, 5, 3, 20, 7};

        Solution105.TreeNode res = solution105.buildTree(preorder, inorder);

        assertEquals(3, res.val);
        assertEquals(9, res.left.val);
        assertEquals(10, res.left.left.val);
        assertEquals(5, res.left.right.val);
        assertEquals(20, res.right.val);
        assertEquals(7, res.right.right.val);
    }

}