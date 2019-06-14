package linkedLists;

import java.util.HashMap;
import java.util.Map;

public class Solution138 {
    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    /**
     * This solution is not mine and it is better than mine
     *
     */
    public Node copyRandomList(Node head) {
        Map<Node, Node> dict = new HashMap<>();
        Node current = head;
        while (current != null) {
            dict.computeIfAbsent(current, k -> new Node()).val = current.val;
            current = current.next;
        }

        current = head;
        while (current != null) {
            dict.get(current).next = dict.get(current.next);
            dict.get(current).random = dict.get(current.random);
            current = current.next;
        }
        return dict.get(head);
    }

    /**
     * This solution mine
     */
    public Node copyRandomList2(Node head) {
        Map<Integer, Node> dict = new HashMap<>();
        Node copyHead = new Node();
        copyHead.val = head.val;
        dict.put(copyHead.val, copyHead);
        Node current = head;
        while (current != null) {
            Node copyNext = null;
            if (current.next != null) {
                copyNext = dict.computeIfAbsent(current.next.val, k -> new Node());
                copyNext.val = current.next.val;
            }

            Node copyRandom = null;
            if (current.random != null) {
                copyRandom = dict.computeIfAbsent(current.random.val, k -> new Node());
                copyRandom.val = current.random.val;
            }

            Node copyCurrent = dict.get(current.val);
            copyCurrent.next = copyNext;
            copyCurrent.random = copyRandom;
            current = current.next;
        }
        return copyHead;
    }
}
