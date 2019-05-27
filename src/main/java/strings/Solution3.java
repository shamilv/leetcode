package strings;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.isEmpty())
      return 0;
    int maxlen = 0;
    Map<Character, Integer> dict = new HashMap<>();
    for (int j = 0, i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (dict.containsKey(ch)) {
        int indx = dict.get(ch);
        j = j <= indx ? indx + 1 : j;
      }
      dict.put(ch, i);
      maxlen = Math.max(i - j + 1, maxlen);
    }
    return maxlen;
  }
}
