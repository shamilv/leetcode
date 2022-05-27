package amazon;

import java.util.LinkedList;
import java.util.List;

public class Amazon1268 {
    private static class Node {
        private boolean isEnd;
        Node[] nodes = new Node[26];
    }

    private static class Trie {
        private Node root = new Node();

        private void insert(String word) {
            Node current = root;
            for (char ch: word.toCharArray()) {
                if (current.nodes[ch - 'a'] == null) {
                    current.nodes[ch - 'a'] = new Node();
                }
                current = current.nodes[ch - 'a'];
            }
            current.isEnd = true;
        }

        private List<String> searchWords(String prefix) {
            Node current = root;
            List<String> list = new LinkedList<>();
            for (char ch: prefix.toCharArray()) {
                if (current.nodes[ch - 'a'] != null) {
                    current = current.nodes[ch - 'a'];
                } else {
                    return list;
                }
            }
            dfs(current, prefix, list);
            return list;
        }

        private void dfs(Node current, String word, List<String> list) {
            if (list.size() == 3) {
                return;
            }
            if (current.isEnd) {
                list.add(word);
            }
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (current.nodes[ch - 'a'] != null) {
                    dfs(current.nodes[ch - 'a'], word + ch, list);
                }
            }
        }
    }


    private Trie trie = new Trie();

    //abc, abb, acb, acc
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        for (String product: products) {
            trie.insert(product);
        }

        List<List<String>> ans = new LinkedList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> suggestions = trie.searchWords(searchWord.substring(0, i + 1));
            ans.add(suggestions);
        }
        return ans;
    }
}
