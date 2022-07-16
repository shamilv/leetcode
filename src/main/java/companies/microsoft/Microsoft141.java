package companies.microsoft;

public class Microsoft141 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            fast = fast.next != null ? fast.next.next : null;
            slow = slow.next;
            if (fast != null && fast == slow) {
                return true;
            }
        }
        return false;
    }
}
