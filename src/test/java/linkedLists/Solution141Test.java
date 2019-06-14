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
        Solution141.ListNode head = new Solution141.ListNode(1);

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertFalse(res);
    }

    @Test
    public void baseCase2() {
        Solution141.ListNode head = new Solution141.ListNode(1);
        head.next = head;

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertTrue(res);
    }

    @Test
    public void test() {
        Solution141.ListNode head = new Solution141.ListNode(1);
        head.next = new Solution141.ListNode(2);
        head.next.next = new Solution141.ListNode(3);
        head.next.next.next = head;

        Solution141 solution141 = new Solution141();
        boolean res = solution141.hasCycle(head);

        assertTrue(res);
    }

}