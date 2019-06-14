package linkedLists;

public class Solution23 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = first.next;
        ListNode prev = new ListNode(-1);
        prev.next = first;
        head = prev;
        while (second != null) {
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            first = first.next;
            second = first != null ? first.next: null;
        }
        return head.next;
    }
}
