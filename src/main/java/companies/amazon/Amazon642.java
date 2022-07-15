package companies.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Amazon642 {

    private static class TrieNode {
        private int degree;
        private TrieNode[] dict = new TrieNode[27];
    }

    private static class Pair {
        private String word;
        private int degree;
        public Pair(String word, int degree) {
            this.word = word;
            this.degree = degree;
        }
    }

    private static class Trie {
        private TrieNode root = new TrieNode();

        public void add(String sentence, int degree) {
            TrieNode current = root;
            for (char ch : sentence.toCharArray()) {
                int index = ch == ' ' ? 26 : ch - 'a';
                if (current.dict[index] == null) {
                    current.dict[index] = new TrieNode();
                }
                current = current.dict[index];
            }
            current.degree += degree;
        }

        private List<String> search(String query) {
            TrieNode current = root;
            PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.degree == b.degree ? b.word.compareTo(a.word) : a.degree - b.degree);

            for (int i = 0; i < query.length() && current != null; i++) {
                char ch = query.charAt(i);
                int index = ch == ' ' ? 26 : ch - 'a';
                /*if (current.dict[index] != null) {
                    int degree = current.dict[index].degree;
                    if (degree > 0) {
                        q.add(new Pair(query.substring(0, i+1), degree));
                        if (q.size() > 3) {
                            q.poll();
                        }
                    }
                }*/
                current = current.dict[index];
            }

            dfs(current, query, q);
            LinkedList<String> ans = new LinkedList<>();
            while (!q.isEmpty()) {
                ans.addFirst(q.poll().word);
            }
            return ans;
        }

        private void dfs(TrieNode current, String query, PriorityQueue<Pair> q) {
            if (current == null) return;
            int degree = current.degree;
            if (degree > 0) {
                q.add(new Pair(query, degree));
                if (q.size() > 3) {
                    q.poll();
                }
            }

            for (int i = 0; i < 27; i++) {
                if (current.dict[i] != null) {
                    char ch = i == 26 ? ' ' : (char) ('a' + i);
                    dfs(current.dict[i], query + ch, q);
                }
            }
        }
    }

    private Trie trie = new Trie();
    private String query = "";

    public Amazon642(String[] sentences, int[] times) {
        for (int i = 0; i < sentences.length; i++) {
            trie.add(sentences[i], times[i]);
        }
    }

    public List<String> input(char c) {
        if (c == '#') {
            trie.add(query, 1);
            query = "";
            return new ArrayList<>();
        }
        query += String.valueOf(c);
        return trie.search(query);
    }
}
