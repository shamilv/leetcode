package linkedLists;

/**
 * not me
 */
public class Solution234 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode slow = head, fast = head;
        while (fast != null) {
            fast = fast.next == null ? null : fast.next.next;
            slow = slow.next == null ? slow : slow.next;
        }
        ListNode reversedNode = reverse(slow);
        slow = head;
        while (reversedNode != null) {
            if (slow.val != reversedNode.val)
                return false;
            reversedNode = reversedNode.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = new ListNode(-1), current = head;
        prev.next = head;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        head.next = null;
        return prev;
    }
}
