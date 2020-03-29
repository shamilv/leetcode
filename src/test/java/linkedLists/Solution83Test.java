package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Solution83Test {

    @Test
    public void test1() {
        Solution83 solution83 = new Solution83();
        ListNode ans = solution83.deleteDuplicates(null);
        assertNull(ans);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        Solution83 solution83 = new Solution83();
        ListNode ans = solution83.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertNull(ans.next);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        Solution83 solution83 = new Solution83();
        ListNode ans = solution83.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        Solution83 solution83 = new Solution83();
        ListNode ans = solution83.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test5() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        Solution83 solution83 = new Solution83();
        ListNode ans = solution83.deleteDuplicates(head);
        assertEquals(2, ans.val);
        assertNull(ans.next);
    }

}