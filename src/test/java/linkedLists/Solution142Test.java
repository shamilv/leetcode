package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution142Test {

    @Test
    public void cornerCase() {
        Solution142 solution142 = new Solution142();
        Solution142.ListNode res = solution142.detectCycle(null);

        assertNull(res);
    }

    @Test
    public void baseCase() {
        Solution142.ListNode head = new Solution142.ListNode(1);

        Solution142 solution142 = new Solution142();
        Solution142.ListNode res = solution142.detectCycle(head);

        assertNull(res);
    }

    @Test
    public void baseCase2() {
        Solution142.ListNode head = new Solution142.ListNode(1);
        head.next = head;

        Solution142 solution142 = new Solution142();
        Solution142.ListNode res = solution142.detectCycle(head);

        assertEquals(1, res.val);
    }

    @Test
    public void regularCase() {
        Solution142.ListNode head = new Solution142.ListNode(1);
        head.next = new Solution142.ListNode(2);
        head.next.next = new Solution142.ListNode(3);
        head.next.next.next = head;

        Solution142 solution142 = new Solution142();
        Solution142.ListNode res = solution142.detectCycle(head);

        assertEquals(1, res.val);
    }

    @Test
    public void regularCase2() {
        Solution142.ListNode head = new Solution142.ListNode(1);
        head.next = new Solution142.ListNode(2);
        head.next.next = new Solution142.ListNode(3);
        head.next.next.next = new Solution142.ListNode(4);
        head.next.next.next.next = new Solution142.ListNode(5);
        head.next.next.next.next.next = head.next.next.next;

        Solution142 solution142 = new Solution142();
        Solution142.ListNode res = solution142.detectCycle(head);

        assertEquals(4, res.val);
    }

}