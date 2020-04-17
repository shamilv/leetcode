package heap;

import linkedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution23Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);

        Solution23 solution23 = new Solution23();
        ListNode ans = solution23.mergeKList(new ListNode[]{node1, node2, node3});

        assertEquals(ans.val, 1);
        assertEquals(ans.next.val, 2);
        assertEquals(ans.next.next.val, 3);
        assertNull(ans.next.next.next);
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(3);
        node2.next = new ListNode(5);

        Solution23 solution23 = new Solution23();
        ListNode ans = solution23.mergeKList(new ListNode[]{node1, node2});

        assertEquals(ans.val, 1);
        assertEquals(ans.next.val, 2);
        assertEquals(ans.next.next.val, 3);
        assertEquals(ans.next.next.next.val, 5);
        assertEquals(ans.next.next.next.next.val, 5);
        assertNull(ans.next.next.next.next.next);
    }

}