package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {

    @Test
    public void edgeCase1() {
        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(null, null);
        assertNull(res);
    }

    @Test
    public void edgeCase2() {
        Solution21.ListNode l1 = new Solution21.ListNode(1);
        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(l1, null);
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    public void edgeCase3() {
        Solution21.ListNode l2 = new Solution21.ListNode(1);
        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(null, l2);
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    public void baseCase1() {
        Solution21.ListNode l1 = new Solution21.ListNode(1);
        Solution21.ListNode l2 = new Solution21.ListNode(1);
        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(l1, l2);
        assertEquals(1, res.val);
        assertEquals(1, res.next.val);
        assertNull(res.next.next);
    }

    @Test
    public void regularCase1() {
        Solution21.ListNode l1 = new Solution21.ListNode(1);
        l1.next = new Solution21.ListNode(2);
        l1.next.next = new Solution21.ListNode(3);
        Solution21.ListNode l2 = new Solution21.ListNode(1);
        l2.next = new Solution21.ListNode(3);
        l2.next.next = new Solution21.ListNode(5);

        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(l1, l2);
        assertEquals(1, res.val);
        assertEquals(1, res.next.val);
        assertEquals(2, res.next.next.val);
        assertEquals(3, res.next.next.next.val);
        assertEquals(3, res.next.next.next.next.val);
        assertEquals(5, res.next.next.next.next.next.val);
        assertNull(res.next.next.next.next.next.next);
    }

    @Test
    public void regularCase2() {
        Solution21.ListNode l1 = new Solution21.ListNode(-9);
        l1.next = new Solution21.ListNode(3);
        Solution21.ListNode l2 = new Solution21.ListNode(5);
        l2.next = new Solution21.ListNode(7);

        Solution21 solution21 = new Solution21();
        Solution21.ListNode res = solution21.mergeTwoLists(l1, l2);
        assertEquals(-9, res.val);
        assertEquals(3, res.next.val);
        assertEquals(5, res.next.next.val);
        assertEquals(7, res.next.next.next.val);
    }

}