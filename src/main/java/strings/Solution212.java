package strings;

import java.util.*;

public class Solution212 {

    /**
     * This solution was accepted, but the task Hint 2 suggests to use Trie.
     */

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        for (String word: words) {
            int[][] excluded = new int[board.length][board[0].length];
            Set<Character> dict = new HashSet<>();
            for (Character ch: word.toCharArray())
                dict.add(ch);
            for (int i = 0; i < board.length; i++) {
                boolean found = false;
                for (int j = 0; j < board[0].length; j++) {
                    if (excluded[i][j] == 0) {
                        found = findWord(board, word, i, j, 0, new StringBuilder(), excluded, dict);
                        if (found) {
                            res.add(word);
                            break;
                        }
                    }
                }
                if (found)
                    break;
            }
        }
        return res;
    }

    private boolean findWord(char[][] board, String word, int i, int j, int k, StringBuilder buf, int[][] excluded, Set<Character> dict) {
        if (word.equals(buf.toString()))
            return true;
        if (i < 0 || i == board.length || j < 0 || j == board[0].length)
            return false;

        if (excluded[i][j] == 1 || excluded[i][j] == 2) {
            return false;
        }

        if (!dict.contains(board[i][j])) {
            excluded[i][j] = 1;
            return false;
        }

        if (board[i][j] == word.charAt(k)) {
            buf.append(word.charAt(k));
            int pathValue = excluded[i][j];
            excluded[i][j] = 2;
            boolean res = findWord(board, word, i + 1, j, k + 1, buf, excluded, dict) ||
                    findWord(board, word, i - 1, j, k + 1, buf, excluded, dict) ||
                    findWord(board, word, i, j + 1, k + 1, buf, excluded, dict) ||
                    findWord(board, word, i, j - 1, k + 1, buf, excluded, dict);
            buf.deleteCharAt(buf.length() - 1);
            excluded[i][j] = pathValue;
            return res;
        }
        return false;
    }

    /**
     * This solution was too slow and it met Time Limit Exceeded error

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        for (String word: words) {
            for (int i = 0; i < board.length; i++) {
                boolean found = false;
                for (int j = 0; j < board[0].length; j++) {
                    found = findWord(board, word, i, j, 0, new HashSet<>(), new StringBuilder());
                    if (found) {
                        res.add(word);
                        break;
                    }
                }
                if (found)
                    break;
            }
        }
        return res;
    }

    private boolean findWord(char[][] board, String word, int i, int j, int k, HashSet<String> path, StringBuilder buf) {
        if (word.equals(buf.toString()))
            return true;
        if (i < 0 || i == board.length || j < 0 || j == board[0].length)
            return false;
        if (path.contains(i + "" + j))
            return false;

        if (board[i][j] == word.charAt(k)) {
            buf.append(word.charAt(k));
            path.add(i + "" + j);
            boolean res = findWord(board, word, i + 1, j, k + 1, path, buf) ||
                    findWord(board, word, i - 1, j, k + 1, path, buf) ||
                    findWord(board, word, i, j + 1, k + 1, path, buf) ||
                    findWord(board, word, i, j - 1, k + 1, path, buf);
            buf.deleteCharAt(buf.length() - 1);
            path.remove(i + "" + j);
            return res;
        }
        return false;
    }
     */
}
