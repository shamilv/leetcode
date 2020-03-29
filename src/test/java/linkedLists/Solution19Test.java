package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution19Test {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        Solution19 solution19 = new Solution19();
        ListNode ans = solution19.removeNthFromEnd(head, 1);
        assertNull(ans);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        Solution19 solution19 = new Solution19();
        ListNode ans = solution19.removeNthFromEnd(head, 2);
        assertEquals(2, ans.val);
        assertNull(ans.next);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        Solution19 solution19 = new Solution19();
        ListNode ans = solution19.removeNthFromEnd(head, 1);
        assertEquals(1, ans.val);
        assertNull(ans.next);
    }

}