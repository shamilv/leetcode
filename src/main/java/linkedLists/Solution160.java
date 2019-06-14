package linkedLists;

public class Solution160 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    /**
     * This solution is better than mine
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode iterA = headA, iterB = headB;
        while (iterA != iterB) {
            iterA = iterA == null ? headB : iterA.next;
            iterB = iterB == null ? headA : iterB.next;
        }
        return iterA;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode iterA = headA, iterB = headB;
        int lenA = listLength(iterA), lenB = listLength(iterB);
        while (lenA > lenB) {
            lenA--;
            iterA = iterA.next;
        }
        while (lenB > lenA) {
            lenB--;
            iterB = iterB.next;
        }
        while (iterA != iterB) {
            iterA = iterA.next;
            iterB = iterB.next;
        }
        return iterA;
    }

    private int listLength(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
