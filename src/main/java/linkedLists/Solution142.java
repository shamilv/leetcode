package linkedLists;

public class Solution142 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode iter = head, iterFast = head;
        while (iterFast != null && iterFast.next != null) {
            iterFast = iterFast.next.next;
            iter = iter.next;
            if (iter == iterFast)
                break;
        }

        if (iterFast == null)
            return null;

        iter = head;
        while (iter != iterFast) {
            iter = iter.next;
            iterFast = iterFast.next;
        }
        return iter;
    }
}
