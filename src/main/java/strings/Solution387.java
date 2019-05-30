package strings;

import java.util.LinkedHashMap;

/**
 * On leetcode there is a popular solution using array as it presented below. However this solution is not the best one
 * since the input string should be iterated twice. In case the input string is very long that solution would take
 * more time. However the approach to calculate the index to store the appearance number of char is worth to remember.
 *
 * public int firstUniqChar(String s) {
 *     int freq [] = new int[26];
 *     for(int i = 0; i < s.length(); i ++)
 *       freq [s.charAt(i) - 'a'] ++;
 *     for(int i = 0; i < s.length(); i ++)
 *       if(freq [s.charAt(i) - 'a'] == 1)
 *         return i;
 *     return -1;
 * }
 *
 */

public class Solution387 {
  public int firstUniqChar(String s) {
    if (s == null || s.isEmpty())
      return -1;
    LinkedHashMap<Character, Integer> dict = new LinkedHashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character ch = s.charAt(i);
      if (dict.containsKey(ch))
        dict.put(ch, null);
      else
        dict.put(ch, i);
    }
    for (Integer index: dict.values()) {
      if (index != null)
        return index;
    }
    return -1;
  }

  /*public int firstUniqChar(String s) {
    int freq [] = new int[26];
    for(int i = 0; i < s.length(); i ++)
      freq [s.charAt(i) - 'a'] ++;
    for(int i = 0; i < s.length(); i ++)
      if(freq [s.charAt(i) - 'a'] == 1)
        return i;
    return -1;
  }*/
}
