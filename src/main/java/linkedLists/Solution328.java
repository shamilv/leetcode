package linkedLists;

public class Solution328 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * This version is better than mine
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public ListNode oddEvenListMine(ListNode head) {
        if (head == null)
            return head;
        ListNode odd = head, even = head.next, iter = even;
        while (iter != null && iter.next != null) {
            ListNode currentOdd = iter.next;
            iter.next = currentOdd.next;
            currentOdd.next = even;
            odd.next = currentOdd;
            odd = odd.next;
            iter = iter.next;
        }
        return head;
    }
}
