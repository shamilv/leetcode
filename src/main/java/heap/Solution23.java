package heap;

import linkedLists.ListNode;

import java.util.PriorityQueue;

public class Solution23 {

    public ListNode mergeKList(ListNode[] lists) {
        if (lists == null && lists.length == 0)
            return null;
        ListNode handler = new ListNode(-1), current = handler;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode n: lists) {
            q.add(n);
        }
        while (!q.isEmpty()) {
            ListNode h = q.poll();
            current.next = h;
            current = current.next;
            if (h.next != null) {
                q.add(h.next);
            }
        }
        return handler.next;
    }
}
