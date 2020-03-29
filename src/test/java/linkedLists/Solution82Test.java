package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution82Test {

    @Test
    public void test1() {
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(null);
        assertNull(ans);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(head);
        assertNull(ans);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertNull(ans.next);
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertEquals(4, ans.next.next.val);
        assertNull(ans.next.next.next);
    }

    @Test
    public void test5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(head);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertEquals(5, ans.next.next.val);
        assertNull(ans.next.next.next);
    }

    @Test
    public void test6() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        Solution82 solution82 = new Solution82();
        ListNode ans = solution82.deleteDuplicates(head);
        assertEquals(2, ans.val);
        assertEquals(3, ans.next.val);
        assertNull(ans.next.next);
    }

}