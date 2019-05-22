package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnnagramms {
  public List<Integer> findAnnagramms(String w, String s) {
    int wlen = w.length();
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < wlen; i++) {
      char ch = w.charAt(i);
      int cnt = map.getOrDefault(ch, 0);
      map.put(ch, ++cnt);
    }

    for (int i = 0; i < wlen; i++) {
      char ch = s.charAt(i);
      int cnt = map.getOrDefault(ch, 0);
      map.put(ch, --cnt);
      deleteIfZero(map, ch);
    }

    List<Integer> res = new ArrayList<>();
    if (map.isEmpty())
      res.add(0);

    for (int i = wlen; i < s.length(); i++) {
      char firstChar = s.charAt(i - wlen);
      char secondChar = s.charAt(i);

      int cnt = map.getOrDefault(firstChar, 0);
      map.put(firstChar, ++cnt);
      deleteIfZero(map, firstChar);

      cnt = map.getOrDefault(secondChar, 0);
      map.put(secondChar, --cnt);
      deleteIfZero(map, secondChar);

      if (map.isEmpty())
        res.add(i - wlen + 1);
    }

    return res;
  }

  private void deleteIfZero(Map<Character, Integer> map, char ch) {
    if (map.get(ch) == 0)
      map.remove(ch);
  }
}
