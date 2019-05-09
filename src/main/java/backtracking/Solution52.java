package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution52 {

    public int totalNQueens(int n) {
        return totalNQueens(n, new ArrayList<>());
    }

    private int totalNQueens(int n, List<Integer> buf) {
        int cnt = 0;
        if (n == buf.size())
            return ++cnt;

        for (int i = 0; i < n; i++) {
            buf.add(i);
            if (isValid(buf))
                cnt += totalNQueens(n, buf);
            buf.remove(buf.size() - 1);
        }
        return cnt;
    }

    private boolean isValid(List<Integer> buf) {
        int newrow = buf.size() - 1, newcol = buf.get(buf.size() - 1);
        for (int i = buf.size() - 2; i >= 0; i--) {
            int prevrow = i, prevcol = buf.get(i);
            int diff = newrow - prevrow;
            if (newcol == prevcol || newcol - diff == prevcol || newcol + diff == prevcol)
                return false;
        }
        return true;
    }
}
