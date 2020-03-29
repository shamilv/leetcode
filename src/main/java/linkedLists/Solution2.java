package linkedLists;

public class Solution2 {

    //T.C.: O(N)
    //S.C.: O(1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0), node = root;
        int left = 0;
        while (l1 != null || l2 != null || left > 0) {
            int num = left;
            num = l1 != null ? num + l1.val : num;
            num = l2 != null ? num + l2.val : num;
            int newVal = num % 10;
            left = num / 10;
            node.next = new ListNode(newVal);
            node = node.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return root.next;
    }


}
