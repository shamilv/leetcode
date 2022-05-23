package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Amazon2Test {

    @Test
    public void test1() {
        Amazon2 amazon2 = new Amazon2();
        Amazon2.ListNode l1 = new Amazon2.ListNode(1);
        Amazon2.ListNode l2 = new Amazon2.ListNode(9);
        Amazon2.ListNode ans = amazon2.addTwoNumbers(l1, l2);
        assertEquals(0, ans.val);
        assertEquals(1, ans.next.val);
    }

}