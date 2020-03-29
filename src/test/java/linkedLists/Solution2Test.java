package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    public void edgeCase() {
        Solution2 solution2 = new Solution2();
        assertNull(solution2.addTwoNumbers(null, null));
    }

    @Test
    public void baseCase1() {
        ListNode l1 = new ListNode(1);
        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, null);
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    public void baseCase2() {
        ListNode l2 = new ListNode(1);
        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(null, l2);
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    public void baseCase3() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, l2);
        assertEquals(2, res.val);
        assertNull(res.next);
    }

    @Test
    public void baseCase4() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, l2);
        assertEquals(0, res.val);
        assertNull(res.next);
    }

    @Test
    public void regularCase1() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(3);
        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, l2);
        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertNotNull(res.next);
        assertNull(res.next.next);
    }

    @Test
    public void regularCase2() {
        ListNode l1 = new ListNode(8);
        l1.next = new ListNode(9);
        ListNode l2 = new ListNode(5);

        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, l2);
        assertEquals(3, res.val);
        assertEquals(0, res.next.val);
        assertEquals(1, res.next.next.val);
    }

    @Test
    public void regularCase3() {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(1);

        Solution2 solution2 = new Solution2();
        ListNode res = solution2.addTwoNumbers(l1, l2);
        assertEquals(1, res.val);
        assertEquals(0, res.next.val);
        assertEquals(3, res.next.next.val);
    }

}