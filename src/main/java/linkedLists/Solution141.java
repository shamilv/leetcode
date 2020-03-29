package linkedLists;

/** me */
public class Solution141 {

    //T.C.: O(N)
    //S.C.: O(1)
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
