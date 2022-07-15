package companies.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Amazon472 {
    private static class TrieNode {
        private boolean isWord;
        private TrieNode[] dict;
        public TrieNode() {
            dict = new TrieNode[26];
        }
    }

    private static class Trie {
        private TrieNode root;
        public Trie() {
            this.root = new TrieNode();
        }

        //cat
        public void add(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (cur.dict[index] == null) {
                    cur.dict[index] = new TrieNode();
                }
                cur = cur.dict[index];
            }
            cur.isWord = true;
        }

        //cat, cats, dog
        //catsdog
        public boolean searchConcatenated(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length() && cur != null; i++) {
                cur = cur.dict[word.charAt(i) - 'a'];
                if (cur != null && cur.isWord) {
                    boolean flag = i == word.length() - 1 ? true :
                            searchConcatenated(word.substring(i + 1));
                    if (flag) return true;
                }
            }
            return false;
        }
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Trie trie = new Trie();
        List<String> ans = new ArrayList<>();

        for (String word: words) {
            if (word.length() == 0) continue;
            if (trie.searchConcatenated(word)) {
                ans.add(word);
            }
            trie.add(word);
        }
        return ans;
    }
}
