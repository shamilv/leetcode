package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution86Test {
    Solution86 solution86 = new Solution86();

    @Test
    public void test1() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        ListNode ans = solution86.partition(head, 3);
        assertEquals(2, ans.val);
        assertEquals(5, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        ListNode ans = solution86.partition(head, 3);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertEquals(2, ans.next.next.val);
        assertEquals(5, ans.next.next.next.val);
        assertEquals(3, ans.next.next.next.next.val);
        assertEquals(3, ans.next.next.next.next.next.val);
        assertNull(ans.next.next.next.next.next.next);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        ListNode ans = solution86.partition(head, 6);
        assertEquals(1, ans.val);
        assertEquals(5, ans.next.val);
        assertEquals(3, ans.next.next.val);
        assertEquals(2, ans.next.next.next.val);
        assertEquals(3, ans.next.next.next.next.val);
        assertEquals(2, ans.next.next.next.next.next.val);
        assertNull(ans.next.next.next.next.next.next);
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        ListNode ans = solution86.partition(head, 1);
        assertEquals(1, ans.val);
        assertEquals(5, ans.next.val);
        assertEquals(3, ans.next.next.val);
        assertEquals(2, ans.next.next.next.val);
        assertEquals(3, ans.next.next.next.next.val);
        assertEquals(2, ans.next.next.next.next.next.val);
        assertNull(ans.next.next.next.next.next.next);
    }

}