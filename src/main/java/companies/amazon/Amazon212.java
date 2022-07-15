package companies.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Amazon212 {

    private static class TrieNode {
        private boolean isWord;
        private String word;
        private TrieNode[] dict;
        public TrieNode() {
            dict = new TrieNode[26];
        }
    }

    private static class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void add(String word) {
            TrieNode cur = root;
            for (char ch: word.toCharArray()) {
                if (cur.dict[ch - 'a'] == null) {
                    cur.dict[ch - 'a'] = new TrieNode();
                }
                cur = cur.dict[ch - 'a'];
            }
            cur.isWord = true;
            cur.word = word;
        }

        private void searchWords(char[][] board, int row, int col, Set<String> list) {
            searchWords(board, row, col, list, root);
        }

        private void searchWords(char[][] board, int row, int col, Set<String> list, TrieNode root) {
            if (root == null) {
                return;
            }

            if (row < 0 || row == board.length || col < 0 || col == board[0].length || board[row][col] == '0') {
                return;
            }

            char ch = board[row][col];
            TrieNode nextNode = root.dict[ch - 'a'];
            if (nextNode != null) {
                board[row][col] = '0';
                if (nextNode.isWord) {
                    list.add(nextNode.word);
                }
                searchWords(board, row + 1,  col, list, nextNode);
                searchWords(board, row - 1,  col, list, nextNode);
                searchWords(board, row,  col + 1, list, nextNode);
                searchWords(board, row,  col - 1, list, nextNode);
                board[row][col] = ch;
            }
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word: words) {
            trie.add(word);
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                trie.searchWords(board, i, j, set);
            }
        }
        return new ArrayList<>(set);
    }
}
