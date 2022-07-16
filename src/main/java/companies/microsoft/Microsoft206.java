package companies.microsoft;

public class Microsoft206 {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode preHead = new ListNode(0);
        reverse(head, preHead);
        return preHead.next;
    }
    
    private ListNode reverse(ListNode node, ListNode preHead) {
        if (node.next == null) {
            preHead.next = node;
            return node;
        }
        ListNode reverted = reverse(node.next, preHead);
        reverted.next = node;
        node.next = null;
        return node;
    }
}
