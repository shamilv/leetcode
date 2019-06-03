package linkedLists;

public class Solution21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode head = new ListNode(0), current = null;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? l2.val + 1 : l1.val;
            int val2 = l2 == null ? l1.val + 1 : l2.val;
            current = (current == null) ? head : (current.next = new ListNode(0));
            current.val = Math.min(val1, val2);
            if (val1 <= val2)
                l1 = l1.next;
            else
                l2 = l2.next;
        }
        return head;
    }
}
