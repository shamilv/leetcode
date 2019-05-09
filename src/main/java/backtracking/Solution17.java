package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    private final static Map<String, String> kv = new HashMap<>();
    static {
        kv.put("2", "abc");
        kv.put("3", "def");
        kv.put("4", "ghi");
        kv.put("5", "jkl");
        kv.put("6", "mno");
        kv.put("7", "pqrs");
        kv.put("8", "tuv");
        kv.put("9", "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty())
            return res;
        letterCombinations(digits, 0, res, new StringBuilder());
        return res;
    }

    private void letterCombinations(String digits, int pos, List<String> res, StringBuilder buffer) {
        if (pos == digits.length()) {
            res.add(buffer.toString());
            return;
        }
        String word = kv.get(String.valueOf(digits.charAt(pos)));
        for (int i = 0; i < word.length(); i++) {
            buffer.append(word.charAt(i));
            letterCombinations(digits, pos + 1, res, buffer);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}
