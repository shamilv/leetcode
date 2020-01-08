package heap;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private static class Node {
        private int key;
        private int value;
        private Node prev;
        private Node next;

        Node() {
        }

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node head = new Node();
    private Map<Integer, Node> map = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        int ans = -1;
        Node node = map.get(key);
        if (node != null) {
            sendToEnd(node);
            ans = node.value;
        }
        return ans;
    }

    public void put(int key, int value) {
        Node newNode = map.get(key);
        if (newNode != null) {
            newNode.value = value;
            sendToEnd(newNode);
        } else {
            if (capacity == 0) {
                Node next = head.next;
                head.next = next.next;
                if (next.next != null)
                    next.next.prev = head;
                map.remove(next.key);
            } else
                capacity--;


            newNode = new Node(key, value);
            if (head.next == null) {
                head.next = newNode;
                head.prev = newNode;
                newNode.next = head;
                newNode.prev = head;
            } else {
                Node last = head.prev;
                last.next = newNode;
                newNode.prev = last;
                newNode.next = head;
                head.prev = newNode;
            }
            map.put(key, newNode);
        }
    }

    private void sendToEnd(Node node) {
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;

        prev = head.prev;
        prev.next = node;
        node.prev = prev;
        node.next = head;
        head.prev = node;
    }
}
