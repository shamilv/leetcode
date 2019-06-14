package linkedLists;

/** me */
public class Solution141 {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode iter = head, fastIter = head.next;
        while (fastIter != null && iter != fastIter) {
            fastIter = fastIter.next == null ? null : fastIter.next.next;
            iter = iter.next;
        }
        return fastIter != null;
    }
}
