package algorithm.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Trie {

    private static class TrieNode {
        Character ch;
        Map<Character, TrieNode> nodes = new HashMap<>();
        boolean isEnd;

        TrieNode(Character ch) {
            this.ch = ch;
        }
    }

    private TrieNode root = new TrieNode('\0');

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            TrieNode nextNode = node.nodes.getOrDefault(c, new TrieNode(c));
            node.nodes.put(c, nextNode);
            node = nextNode;
        }
        node.isEnd = true;
    }

    public void remove(String word) {
        Stack<TrieNode> s = new Stack<>();
        TrieNode node = root;
        for (Character c: word.toCharArray()) {
            TrieNode nextNode = node.nodes.get(c);
            if (nextNode == null) return;
            s.push(nextNode);
            node = nextNode;
        }
        if (!s.isEmpty()) {
            node = s.pop();
            if (!node.isEnd) return;
            boolean canBeRemoved = node.nodes.size() == 0;
            Character c = node.ch;
            while (!s.isEmpty()) {
                node = s.pop();
                if (canBeRemoved) {
                    node.nodes.remove(c);
                }
                canBeRemoved = canBeRemoved && node.nodes.size() == 0 && !node.isEnd;
                c = node.ch;
            }
        }
    }

    public boolean find(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            TrieNode nextNode = node.nodes.get(c);
            if (nextNode == null) return false;
            node = nextNode;
        }
        return node.isEnd;
    }

    public boolean startWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character c = prefix.charAt(i);
            TrieNode nextNode = node.nodes.get(c);
            if (nextNode == null) return false;
            node = nextNode;
        }
        return true;
    }
}
