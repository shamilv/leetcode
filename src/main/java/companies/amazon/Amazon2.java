package companies.amazon;

public class Amazon2 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private ListNode head = new ListNode();
    private ListNode pointer = head;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int left = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int tmp = l1Val + l2Val + left;
            left = toList(tmp);
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        while (left != 0) {
            left = toList(left);
        }

        return head.next;
    }

    private int toList(int tmp) {
        int k = tmp % 10;
        ListNode node = new ListNode(k);
        pointer.next = node;
        pointer = node;
        return (tmp - k) / 10;
    }
}
