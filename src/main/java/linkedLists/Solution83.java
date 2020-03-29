package linkedLists;

public class Solution83 {

    //T.C.: O(N)
    //S.C.: O(N)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }
}
