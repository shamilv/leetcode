package strings;

import java.util.*;

public class Solution212 {
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
}
