package crack;

public class Solution2_3 {

    //T.C.: O(N)
    //S.C.: O(1)
    public ListNode deleteMiddleNode(ListNode head) {
        ListNode root = new ListNode(0), fast = head.next, slow = root;
        root.next = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return root.next;
    }
}
