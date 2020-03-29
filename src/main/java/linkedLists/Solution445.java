package linkedLists;

import java.util.Stack;

public class Solution445 {


    //T.C.: O(N)
    //S.C.: O(1)
    private int left = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = count(l1), m = count(l2);
        ListNode node = helper(l1, n, l2, m);
        if (left > 0) {
            ListNode root = new ListNode(left);
            root.next = node;
            return root;
        }
        return node;
    }

    private int count(ListNode node) {
        int n = 0;
        while (node != null) {
            node = node.next;
            n++;
        }
        return n;
    }

    private ListNode helper(ListNode l1, int n, ListNode l2, int m) {
        if (l1 == null && l2 == null)
            return null;
        ListNode node;
        if (n == m) {
            ListNode next = helper(l1.next, n - 1, l2.next, m - 1);
            int num = l1.val + l2.val + left;
            left = num / 10;
            node = new ListNode(num % 10);
            node.next = next;
        } else if (n > m) {
            ListNode next = helper(l1.next, n - 1, l2, m);
            int num = l1.val + left;
            left = num / 10;
            node = new ListNode(num % 10);
            node.next = next;
        } else {
            ListNode next = helper(l1, n, l2.next, m - 1);
            int num = l2.val + left;
            left = num / 10;
            node = new ListNode(num % 10);
            node.next = next;
        }
        return node;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        ListNode node = l1;
        while (node != null) {
            s1.add(node);
            node = node.next;
        }
        node = l2;
        while (node != null) {
            s2.add(node);
            node = node.next;
        }
        int left = 0;
        ListNode root = new ListNode(0);
        while (!s1.isEmpty() || !s2.isEmpty() || left > 0) {
            int num = left;
            num = !s1.isEmpty() ? num + s1.pop().val : num;
            num = !s2.isEmpty() ? num + s2.pop().val : num;
            int newVal = num % 10;
            left = num / 10;
            node = new ListNode(newVal);
            node.next = root.next;
            root.next = node;
        }
        return root.next;
    }
}
