package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution328Test {

    @Test
    public void cornerCase() {
        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(null);
        assertNull(res);
    }

    @Test
    public void baseCase() {
        Solution328.ListNode head = new Solution328.ListNode(1);
        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(head);
        assertEquals(res.val, head.val);
    }

    @Test
    public void baseCase2() {
        Solution328.ListNode node1 = new Solution328.ListNode(1);
        node1.next = new Solution328.ListNode(2);
        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(node1);
        assertEquals(res.val, node1.val);
        assertEquals(res.next.val, node1.next.val);
    }

    @Test
    public void regularCase() {
        Solution328.ListNode node1 = new Solution328.ListNode(1);
        node1.next = new Solution328.ListNode(2);
        node1.next.next = new Solution328.ListNode(3);

        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(node1);
        assertEquals(1, res.val);
        assertEquals(3, res.next.val);
        assertEquals(2, res.next.next.val);
    }

    @Test
    public void regularCase2() {
        Solution328.ListNode node1 = new Solution328.ListNode(1);
        node1.next = new Solution328.ListNode(2);
        node1.next.next = new Solution328.ListNode(3);
        node1.next.next.next = new Solution328.ListNode(4);

        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(node1);
        assertEquals(1, res.val);
        assertEquals(3, res.next.val);
        assertEquals(2, res.next.next.val);
        assertEquals(4, res.next.next.next.val);
    }

    @Test
    public void regularCase3() {
        Solution328.ListNode node1 = new Solution328.ListNode(1);
        node1.next = new Solution328.ListNode(2);
        node1.next.next = new Solution328.ListNode(3);
        node1.next.next.next = new Solution328.ListNode(4);
        node1.next.next.next.next = new Solution328.ListNode(5);

        Solution328 solution328 = new Solution328();
        Solution328.ListNode res = solution328.oddEvenList(node1);
        assertEquals(1, res.val);
        assertEquals(3, res.next.val);
        assertEquals(5, res.next.next.val);
        assertEquals(2, res.next.next.next.val);
        assertEquals(4, res.next.next.next.next.val);
    }

}