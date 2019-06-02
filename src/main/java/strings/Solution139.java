package strings;

import java.util.*;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        return wordBreak(s, dict, 0, new Boolean[s.length()]);
    }

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     * @param s
     * @param wordDict
     * @param start
     * @param memo
     * @return
     */
    public boolean wordBreak(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length())
            return true;

        if (memo[start] != null)
            return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreak(s, wordDict, end, memo))
                return memo[start] = true;
        }
        return memo[start] = false;
    }

    /**
     Correct solution but time complexity is O(n^n)
      */
    public boolean wordBreakTooSlow(String s, List<String> wordDict) {
        Map<String, Integer> dict = new HashMap<>();
        for (String work: wordDict)
            dict.put(work, 0);
        Stack<String> stack = new Stack<>();
        stack.push("");
        int left = 0, right = 0, ulen = 0;
        while (ulen < s.length()) {
            String w = stack.pop();
            if (w.length() == s.length())
                return false;
            if (right == s.length()) {
                w = stack.pop();
                left -= w.length();
                right = left + w.length();
                ulen -= w.length();
            }
            w = s.substring(left, right + 1);
            stack.push(w);
            if (dict.containsKey(w)) {
                ulen += right - left + 1;
                left = right + 1;
                stack.push("");
            }
            right++;
        }

        return ulen == s.length();
    }
}
