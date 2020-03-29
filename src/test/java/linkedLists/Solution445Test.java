package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution445Test {

    @Test
    public void test1() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        Solution445 solution445 = new Solution445();
        ListNode ans = solution445.addTwoNumbers(l1, l2);
        assertEquals(1, ans.val);
        assertEquals(0, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(9);
        ListNode l2 = new ListNode(2);
        Solution445 solution445 = new Solution445();
        ListNode ans = solution445.addTwoNumbers(l1, l2);
        assertEquals(2, ans.val);
        assertEquals(1, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        Solution445 solution445 = new Solution445();
        ListNode ans = solution445.addTwoNumbers(l1, l2);
        assertEquals(2, ans.val);
        assertEquals(1, ans.next.val);
        assertNull(ans.next.next);
    }

}