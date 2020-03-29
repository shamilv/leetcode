package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution876Test {

    @Test
    public void test1() {
        Solution876 solution876 = new Solution876();
        ListNode ans = solution876.middleNode(null);
        assertNull(ans);
    }

    @Test
    public void test2() {
        ListNode node = new ListNode(1);
        Solution876 solution876 = new Solution876();
        ListNode ans = solution876.middleNode(node);
        assertEquals(1, ans.val);
    }

    @Test
    public void test3() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        Solution876 solution876 = new Solution876();
        ListNode ans = solution876.middleNode(node);
        assertEquals(2, ans.val);
    }

    @Test
    public void test4() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        Solution876 solution876 = new Solution876();
        ListNode ans = solution876.middleNode(node);
        assertEquals(2, ans.val);
    }

    @Test
    public void test5() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        Solution876 solution876 = new Solution876();
        ListNode ans = solution876.middleNode(node);
        assertEquals(3, ans.val);
    }

}