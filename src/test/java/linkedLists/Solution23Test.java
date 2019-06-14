package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution23Test {

    @Test
    public void cornerCase() {
        Solution23 solution23 = new Solution23();
        Solution23.ListNode head = solution23.swapPairs(null);
        assertNull(head);
    }

    @Test
    public void cornerCase2() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);
        assertEquals(head, res);
    }

    @Test
    public void baseCase() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        head.next = new Solution23.ListNode(2);

        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);

        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
    }

    @Test
    public void regularCase1() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        head.next = new Solution23.ListNode(2);
        head.next.next = new Solution23.ListNode(3);

        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);

        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(3, res.next.next.val);
    }

    @Test
    public void regularCase2() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        head.next = new Solution23.ListNode(2);
        head.next.next = new Solution23.ListNode(3);
        head.next.next.next = new Solution23.ListNode(4);

        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);

        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(4, res.next.next.val);
        assertEquals(3, res.next.next.next.val);
    }

    @Test
    public void regularCase3() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        head.next = new Solution23.ListNode(2);
        head.next.next = new Solution23.ListNode(3);
        head.next.next.next = new Solution23.ListNode(4);
        head.next.next.next.next = new Solution23.ListNode(5);

        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);

        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(4, res.next.next.val);
        assertEquals(3, res.next.next.next.val);
        assertEquals(5, res.next.next.next.next.val);
    }

    @Test
    public void regularCase4() {
        Solution23.ListNode head = new Solution23.ListNode(1);
        head.next = new Solution23.ListNode(2);
        head.next.next = new Solution23.ListNode(3);
        head.next.next.next = new Solution23.ListNode(4);
        head.next.next.next.next = new Solution23.ListNode(5);
        head.next.next.next.next.next = new Solution23.ListNode(6);

        Solution23 solution23 = new Solution23();
        Solution23.ListNode res = solution23.swapPairs(head);

        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(4, res.next.next.val);
        assertEquals(3, res.next.next.next.val);
        assertEquals(6, res.next.next.next.next.val);
        assertEquals(5, res.next.next.next.next.next.val);
    }

}