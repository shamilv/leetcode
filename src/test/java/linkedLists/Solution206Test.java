package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution206Test {

    @Test
    public void edgeCase() {
        Solution206 solution206 = new Solution206();
        ListNode res = solution206.reverseList(null);
        assertNull(res);
    }

    @Test
    public void baseCase() {
        ListNode head = new ListNode(1);
        Solution206 solution206 = new Solution206();
        ListNode res = solution206.reverseList(head);
        assertEquals(res.val, head.val);
    }

    @Test
    public void regularCase() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;

        Solution206 solution206 = new Solution206();
        ListNode res = solution206.reverseList(head);
        assertEquals(res, third);
        assertEquals(second, third.next);
        assertEquals(head, second.next);
        assertEquals(null, head.next);
    }

}