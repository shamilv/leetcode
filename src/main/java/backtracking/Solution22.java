package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        StringBuilder buffer = new StringBuilder("(");
        generateParenthesis(n - 1, n, buffer, res);
        return res;
    }

    private void generateParenthesis(int icnt, int jcnt, StringBuilder buffer, List<String> res) {
        if (icnt == 0 && jcnt == 0) {
            res.add(buffer.toString());
            return;
        }
        if (icnt > 0) {
            buffer.append("(");
            generateParenthesis(icnt - 1, jcnt, buffer, res);
            buffer.deleteCharAt(buffer.length() - 1);
        }
        if (jcnt > icnt) {
            buffer.append(")");
            generateParenthesis(icnt, jcnt - 1, buffer, res);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}
