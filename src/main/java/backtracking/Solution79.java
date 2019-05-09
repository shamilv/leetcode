package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution79 {

    private boolean backtrack(char[][] board, int ipos, int jpos, String word, int wpos, int cnt, List<String> path) {
        if (cnt == word.length())
            return true;

        if (path.contains(ipos + "" + jpos))
            return false;

        if (ipos < 0 || ipos >= board.length || jpos < 0 || jpos >= board[0].length)
            return false;

        if (wpos >= word.length())
            return false;

        if (board[ipos][jpos] == word.charAt(wpos)) {
            cnt++;
            path.add(ipos + "" + jpos);
            boolean res = backtrack(board, ipos + 1, jpos, word, wpos + 1, cnt, path) ||
            backtrack(board, ipos - 1, jpos, word, wpos + 1, cnt, path) ||
            backtrack(board, ipos, jpos + 1, word, wpos + 1, cnt, path) ||
            backtrack(board, ipos, jpos - 1, word, wpos + 1, cnt, path);
            if (res) return true;
            cnt--;
            path.remove(path.size()-1);
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0)
            return false;
        if (word == null || word.isEmpty())
            return false;
        List<String> path = new ArrayList<>();
        for (int ipos = 0; ipos < board.length; ipos++) {
            for (int jpos = 0; jpos < board[0].length; jpos++) {
                boolean res = backtrack(board, ipos, jpos, word, 0, 0, path);
                if (res) return true;
            }
        }
        return false;
    }

}
