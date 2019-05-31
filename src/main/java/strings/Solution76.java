package strings;

import java.util.*;

public class Solution76 {
  public String minWindow(String s, String t) {
    LinkedHashSet<String> path = new LinkedHashSet<>();
    int left = -1, right = 0, mleft = -1, mright = -1, mlen = Integer.MAX_VALUE;
    HashSet<Character> dict = new HashSet<>();
    Map<Character, Integer> freq = new HashMap<>();
    for (Character ch: t.toCharArray())
      dict.add(ch);
    while (right < s.length()) {
      Character ch = s.charAt(right);
      if (dict.contains(ch)) {
        left = left == -1 ? right : left;
        int cnt = freq.getOrDefault(ch , 0);
        freq.put(ch, ++cnt);
        while (freq.size() == t.length()) {
          ch = s.charAt(left);
          if (dict.contains(ch)) {
            if (mlen > right - left + 1) {
              mlen = right - left + 1;
              mleft = left;
              mright = right;
            }
            cnt = freq.get(ch);
            freq.put(ch, --cnt);
            if (cnt == 0)
              freq.remove(ch);
          }
          left++;
        }
      }
      right++;
    }
    return mleft != -1 && mright != -1 ? s.substring(mleft, mright + 1) : "";
  }
}
