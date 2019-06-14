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
        ListNode iter = head, fastIter = head;
        while (fastIter != null && fastIter.next != null) {
            fastIter = fastIter.next.next;
            iter = iter.next;
            if (iter == fastIter)
                return true;
        }
        return false;
    }
}
