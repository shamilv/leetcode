package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution116Test {

    @Test
    public void test1() {
        Solution116.Node node = new Solution116.Node(1, null, null, null);

        Solution116 solution116 = new Solution116();
        Solution116.Node test = solution116.connect(node);

        assertEquals(1, test.val);
    }

    @Test
    public void test2() {
        Solution116.Node left = new Solution116.Node(2, null, null, null);
        Solution116.Node right = new Solution116.Node(3, null, null, null);
        Solution116.Node node = new Solution116.Node(1, left, right, null);

        Solution116 solution116 = new Solution116();
        Solution116.Node test = solution116.connect(node);

        assertEquals(1, test.val);
        assertEquals(null, test.next);
        assertEquals(right, test.left.next);
        assertEquals(null, test.right.next);
    }

    @Test
    public void test3() {
        Solution116.Node left21 = new Solution116.Node(2, null, null, null);
        Solution116.Node right21 = new Solution116.Node(3, null, null, null);

        Solution116.Node left22 = new Solution116.Node(2, null, null, null);
        Solution116.Node right22 = new Solution116.Node(3, null, null, null);

        Solution116.Node left1 = new Solution116.Node(2, left21, right21, null);
        Solution116.Node right1 = new Solution116.Node(3, left22, right22, null);
        Solution116.Node node = new Solution116.Node(1, left1, right1, null);

        Solution116 solution116 = new Solution116();
        Solution116.Node test = solution116.connect(node);

        assertEquals(1, test.val);
        assertEquals(null, test.next);
        assertEquals(right1, test.left.next);
        assertEquals(null, test.right.next);

        assertEquals(right21, test.left.left.next);
        assertEquals(left22, test.left.right.next);
        assertEquals(right22, test.right.left.next);
        assertEquals(null, test.right.right.next);
    }

}