package companies.amazon;

import java.util.PriorityQueue;

public class Amazon23 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node: lists) {
            if (node != null) {
                q.add(node);
            }
        }

        ListNode ans = new ListNode();
        ListNode cur = ans;
        while (!q.isEmpty()) {
            ListNode node = q.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) {
                q.add(node.next);
            }
        }
        return ans.next;
    }
}
