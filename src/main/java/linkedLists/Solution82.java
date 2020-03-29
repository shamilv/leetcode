package linkedLists;

public class Solution82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = new ListNode(0), prev = root;
        root.next = head;
        while (head!= null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head.next = head.next.next;
                }
                prev.next = head.next;
                head = prev.next;
            } else {
                prev = head;
                head = head.next;
            }
        }
        return root.next;
    }
}
