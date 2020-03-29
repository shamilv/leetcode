package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Solution2_3Test {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        Solution2_3 solution2_3 = new Solution2_3();
        ListNode ans = solution2_3.deleteMiddleNode(head);
        assertNull(ans);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        Solution2_3 solution2_3 = new Solution2_3();
        ListNode ans = solution2_3.deleteMiddleNode(head);
        assertEquals(2, ans.val);
        assertNull(ans.next);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution2_3 solution2_3 = new Solution2_3();
        ListNode ans = solution2_3.deleteMiddleNode(head);
        assertEquals(1, ans.val);
        assertEquals(3, ans.next.val);
        assertNull(ans.next.next);
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        Solution2_3 solution2_3 = new Solution2_3();
        ListNode ans = solution2_3.deleteMiddleNode(head);
        assertEquals(1, ans.val);
        assertEquals(3, ans.next.val);
        assertEquals(4, ans.next.next.val);
        assertNull(ans.next.next.next);
    }

    @Test
    public void test5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution2_3 solution2_3 = new Solution2_3();
        ListNode ans = solution2_3.deleteMiddleNode(head);
        assertEquals(1, ans.val);
        assertEquals(2, ans.next.val);
        assertEquals(4, ans.next.next.val);
        assertEquals(5, ans.next.next.next.val);
        assertNull(ans.next.next.next.next);
    }

}