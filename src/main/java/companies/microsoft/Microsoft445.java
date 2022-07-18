package companies.microsoft;

import java.util.ArrayDeque;
import java.util.Deque;

public class Microsoft445 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        fillOutStack(l1, stack1);
        fillOutStack(l2, stack2);
        
        int left = 0;
        ListNode preHead = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int val1 = !stack1.isEmpty() ? stack1.pop() : 0;
            int val2 = !stack2.isEmpty() ? stack2.pop() : 0;
            int sum = val1 + val2 + left;
            int val = sum % 10;
            left = sum > 9 ? 1 : 0;
            ListNode node = new ListNode(val);
            node.next = preHead.next;
            preHead.next = node;
        }
        if (left == 1) {
            ListNode node = new ListNode(left);
            node.next = preHead.next;
            preHead.next = node;
        }
        return preHead.next;
    }
    
    private void fillOutStack(ListNode list, Deque<Integer> stack) {
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
    }
}
