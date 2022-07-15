package companies.amazon;

import java.util.*;

public class Amazon17 {

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        Map<String, String> dict = new HashMap<>();
        dict.put("2", "abc");
        dict.put("3", "def");
        dict.put("4", "ghi");
        dict.put("5", "jkl");
        dict.put("6", "mno");
        dict.put("7", "pqrs");
        dict.put("8", "tuv");
        dict.put("9", "wxyz");

        StringBuilder builder = new StringBuilder();
        List<String> mutations = new ArrayList<>();
        backtrack(digits, 0, builder, dict, mutations);
        return mutations;
    }

    private void backtrack(String digits, int i, StringBuilder builder, Map<String, String> dict, List<String> mutations) {
        if (i == digits.length()) {
            mutations.add(builder.toString());
            return;
        }

        String index = digits.substring(i, i + 1);
        for (char ch: dict.get(index).toCharArray()) {
            builder.append(ch);
            backtrack(digits, i + 1, builder, dict, mutations);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
