package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution784 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        if (S == null)
            return res;
        char[] buffer = new char[S.length()];
        letterCasePermutation(S, buffer, 0, res);
        return res;
    }

    private void letterCasePermutation(String S, char[] buffer, int bufferIndex, List<String> res) {
        if (S.length() == 0 || bufferIndex == buffer.length) {
            res.add(new String(buffer));
            return;
        }

        char c = S.charAt(bufferIndex);
        buffer[bufferIndex] = Character.toLowerCase(c);
        letterCasePermutation(S, buffer, bufferIndex+1, res);
        if (Character.isLetter(c)) {
            buffer[bufferIndex] = Character.toUpperCase(c);
            letterCasePermutation(S, buffer, bufferIndex+1, res);
        }
    }
}
