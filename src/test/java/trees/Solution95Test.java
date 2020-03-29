package trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution95Test {

    @Test
    public void test1() {
        Solution95 solution95 = new Solution95();
        List<TreeNode> ans = solution95.generateTrees(2);
        assertEquals(1, ans.get(0).val);
        assertEquals(2, ans.get(0).right.val);
        assertEquals(2, ans.get(1).val);
        assertEquals(1, ans.get(1).left.val);
    }

    @Test
    public void test2() {
        Solution95 solution95 = new Solution95();
        List<TreeNode> ans = solution95.generateTrees(3);

        assertEquals(5, ans.size());

        TreeNode root = ans.get(0);
        assertEquals(1, root.val);
        assertEquals(2, root.right.val);
        assertEquals(3, root.right.right.val);

    }

    @Test
    public void test3() {
        Solution95 solution95 = new Solution95();
        List<TreeNode> ans = solution95.generateTrees(0);

        assertEquals(0, ans.size());
    }

}