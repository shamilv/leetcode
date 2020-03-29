package linkedLists;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, next;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
