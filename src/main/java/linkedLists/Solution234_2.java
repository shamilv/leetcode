package linkedLists;

public class Solution234_2 {

    private boolean isPalindrome = true;
    private ListNode next;

    //T.C.: O(N)
    //S.C.: O(1)
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode root = new ListNode(0), slow = root, fast = root;
        root.next = head;
        helper(slow.next, fast.next.next);
        return isPalindrome;
    }

    private void helper(ListNode slow, ListNode fast) {
        if (fast != null && fast.next != null) {
            helper(slow.next, fast.next.next);
            if (slow.val != next.val)
                isPalindrome = false;
            next = next.next;
        } else {
            if (fast != null) {
                isPalindrome = slow.val == slow.next.val;
                next = slow.next.next;
            } else
                next = slow.next;
        }
    }
}
