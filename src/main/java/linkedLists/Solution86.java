package linkedLists;

public class Solution86 {

    //T.C.: O(N)
    //S.C.: O(1)
    public ListNode partition(ListNode head, int x) {
        ListNode lsRoot = new ListNode(0), lsNode = lsRoot;
        ListNode gtRoot = new ListNode(0), gtNode = gtRoot;
        while (head != null) {
            if (head.val < x) {
                lsNode.next = head;
                lsNode = lsNode.next;
            } else {
                gtNode.next = head;
                gtNode = gtNode.next;
            }
            head = head.next;
        }
        lsNode.next = gtRoot.next;
        gtNode.next = null;
        return lsRoot.next;
    }
}
