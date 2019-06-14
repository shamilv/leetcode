package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution138Test {

    @Test
    public void baseCase1() {
        Solution138.Node head = new Solution138.Node();
        head.val = 1;

        Solution138 solution138 = new Solution138();
        Solution138.Node copyHead = solution138.copyRandomList(head);
        assertNotEquals(copyHead, head);
        assertEquals(copyHead.val, head.val);
    }

    @Test
    public void baseCase2() {
        Solution138.Node head = new Solution138.Node();
        head.val = 1;
        head.random = head;

        Solution138 solution138 = new Solution138();
        Solution138.Node copyHead = solution138.copyRandomList(head);
        assertNotEquals(copyHead, head);
        assertEquals(copyHead.val, head.val);
        assertEquals(copyHead.random.val, head.random.val);
    }

    @Test
    public void baseCase3() {
        Solution138.Node second = new Solution138.Node();
        second.val = 2;

        Solution138.Node head = new Solution138.Node();
        head.val = 1;
        head.next = second;
        head.random = second;
        second.random = head;

        Solution138 solution138 = new Solution138();
        Solution138.Node copyHead = solution138.copyRandomList(head);
        assertNotEquals(copyHead, head);
        assertNotEquals(copyHead.next, head.next);
        assertNotEquals(copyHead.random, head.random);
        assertNotEquals(copyHead.next.random, head.next.random);

        assertEquals(copyHead.val, head.val);
        assertEquals(copyHead.random.val, head.random.val);
        assertEquals(copyHead.next.val, head.next.val);
        assertEquals(copyHead.next.random.val, head.next.random.val);

    }

    @Test
    public void regularCase() {
        Solution138.Node third = new Solution138.Node();
        third.val = 3;

        Solution138.Node second = new Solution138.Node();
        second.val = 2;
        second.next = third;

        Solution138.Node head = new Solution138.Node();
        head.val = 1;
        head.next = second;

        head.random = third;
        second.random = null;
        third.random = third;

        Solution138 solution138 = new Solution138();
        Solution138.Node copyHead = solution138.copyRandomList(head);
        assertNotEquals(copyHead, head);
        assertNotEquals(copyHead.next, head.next);
        assertNotEquals(copyHead.next.next, head.next.next);
        assertNotEquals(copyHead.random, head.random);
        assertNull(copyHead.next.random);
        assertNotEquals(copyHead.next.next.random, head.next.next.random);

        assertEquals(copyHead.val, head.val);
        assertEquals(copyHead.random.val, head.random.val);
        assertEquals(copyHead.next.val, head.next.val);
        assertEquals(copyHead.next.next.val, head.next.next.val);
        assertEquals(copyHead.next.next.random.val, head.next.next.random.val);
    }
}