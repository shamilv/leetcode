package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution141Test {

    @Test
    public void cornerCase() {
        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(null);

        assertFalse(res);
    }

    @Test
    public void baseCase() {
        ListNode head = new ListNode(1);

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertFalse(res);
    }

    @Test
    public void baseCase2() {
        ListNode head = new ListNode(1);
        head.next = head;

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertTrue(res);
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertTrue(res);
    }

}