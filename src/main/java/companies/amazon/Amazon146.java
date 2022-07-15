package companies.amazon;

import java.util.HashMap;
import java.util.Map;

public class Amazon146 {
    private static class Node {
        private int key;
        private int val;
        private Node next;
        private Node prev;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;

    public Amazon146(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node != null) {
            moveToTail(node);
        }
        return node != null ? node.val : -1;
    }

    public void put(int key, int value) {
        if (!cache.containsKey(key)) {
            evict();
            cache.put(key, new Node(key, value));
        } else {
            Node node = cache.get(key);
            node.val = value;
        }
        moveToTail(cache.get(key));

    }

    private void moveToTail(Node node) {
        if (node.prev != null && node.next != null) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }

        Node prevTail = tail.prev;
        prevTail.next = node;
        tail.prev = node;

        node.prev = prevTail;
        node.next = tail;
    }

    private void evict() {
        if (capacity == cache.size()) {
            Node evict = head.next;
            Node nextNode = evict.next;

            nextNode.prev = head;
            head.next = nextNode;

            cache.remove(evict.key);
        }
    }
}
