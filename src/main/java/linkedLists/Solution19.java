package linkedLists;

public class Solution19 {

    //T.C.: O(N)
    //S.C.: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0), prev = root;
        root.next = head;
        while (head != null) {
            head = head.next;
            if (n-- > 0) continue;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return root.next;
    }

}
