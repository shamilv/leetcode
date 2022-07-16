package companies.microsoft;



public class Microsoft2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int shift = 0;
        ListNode preHead = new ListNode(0);
        ListNode node = preHead;
        while (l1 != null || l2 != null) {
            int tmp = sumUp(l1, l2, shift);
            int ans = tmp > 9 ? tmp % 10 : tmp;
            shift = tmp > 9 ? 1 : 0;
            node.next = new ListNode(ans);
            node = node.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if (shift == 1) {
            node.next = new ListNode(shift);
        }
        return preHead.next;
    }
    
    private int sumUp(ListNode l1, ListNode l2, int shift) {
        return shift + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
    }
}
