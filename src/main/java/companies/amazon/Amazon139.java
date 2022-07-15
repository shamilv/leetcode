package companies.amazon;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Amazon139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> memo = new HashSet<>();
        return dfs(s, wordDict, 0, memo);
    }

    private boolean dfs(String s, List<String> wordDict, int i, Set<String> memo) {
        if (s.equals("")) {
            return true;
        }

        for (String dict: wordDict) {
            String key = dict + String.valueOf(i);
            if (!memo.contains(key)) {
                int index = s.indexOf(dict);
                if (index == 0) {
                    String word = s.substring(dict.length());
                    if (dfs(word, wordDict, i + dict.length(), memo)) {
                        return true;
                    }
                }
                memo.add(key);
            }
        }
        return false;
    }
}
