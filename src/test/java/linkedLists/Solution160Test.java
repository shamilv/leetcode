package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution160Test {

    @Test
    public void cornerCase1() {
        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(null, null);
        assertNull(res);
    }

    @Test
    public void cornerCase2() {
        Solution160.ListNode a1 = new Solution160.ListNode(1);
        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(a1, null);
        assertNull(res);
    }

    @Test
    public void cornerCase3() {
        Solution160.ListNode a1 = new Solution160.ListNode(1);
        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(null, a1);
        assertNull(res);
    }

    @Test
    public void baseCase() {
        Solution160.ListNode a1 = new Solution160.ListNode(1);
        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(a1, a1);
        assertEquals(1, res.val);
    }

    @Test
    public void regularCase1() {
        Solution160.ListNode a1 = new Solution160.ListNode(1);
        a1.next = new Solution160.ListNode(2);
        a1.next.next = new Solution160.ListNode(3);
        a1.next.next.next = new Solution160.ListNode(10);
        a1.next.next.next.next = new Solution160.ListNode(11);
        a1.next.next.next.next.next = new Solution160.ListNode(12);

        Solution160.ListNode a2 = new Solution160.ListNode(5);
        a2.next = a1.next.next.next;

        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(a1, a2);

        assertEquals(10, res.val);
    }

    @Test
    public void regularCase2() {
        Solution160.ListNode a1 = new Solution160.ListNode(1);
        a1.next = new Solution160.ListNode(2);
        a1.next.next = new Solution160.ListNode(3);
        a1.next.next.next = new Solution160.ListNode(10);
        a1.next.next.next.next = new Solution160.ListNode(11);
        a1.next.next.next.next.next = new Solution160.ListNode(12);

        Solution160.ListNode a2 = new Solution160.ListNode(5);
        a2.next = new Solution160.ListNode(0);
        a2.next.next = a1.next.next.next.next;

        Solution160 solution160 = new Solution160();
        Solution160.ListNode res = solution160.getIntersectionNode(a1, a2);

        assertEquals(11, res.val);
    }

}