package strings;

import java.util.HashMap;
import java.util.Map;

public class Solution242 {
  public boolean isAnagram(String s, String t) {
    if (s == null || s.isEmpty() || t == null || t.isEmpty())
      return false;
    if (s.length() != t.length())
      return false;

    Map<Character, Integer> dict = new HashMap<>();
    for (char ch: s.toCharArray()) {
      int cnt = dict.getOrDefault(ch, 0);
      dict.put(ch, ++cnt);
    }

    for (char ch: t.toCharArray()) {
      int cnt = dict.getOrDefault(ch, 0);
      dict.put(ch, --cnt);
      if (cnt == 0)
        dict.remove(ch);
    }

    return dict.size() == 0;
  }
}
