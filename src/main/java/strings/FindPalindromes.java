package strings;

import java.util.*;

public class FindPalindromes {
  public List<List<Integer>> findPalindromes(List<String> words) {
    List<List<Integer>> res = new ArrayList<>();
    Map<String, Integer> dict = new HashMap<>();
    for (int i = 0; i < words.size(); i++)
      dict.put(words.get(i), i);

    for (int i = 0; i < words.size(); i++) {
      String word = words.get(i);
      for (int j = 0; j < word.length(); j++) {
        String prefix = word.substring(0, j);
        String suffix = word.substring(j);
        String reversePrefix = reverse(prefix);
        String reverseSuffix = reverse(suffix);

        if (isPalindrome(prefix) && dict.containsKey(reverseSuffix) && dict.get(reverseSuffix) != i)
          res.add(Arrays.asList(dict.get(reverseSuffix), i));

        if (isPalindrome(suffix) && dict.containsKey(reversePrefix) && dict.get(reversePrefix) != i)
          res.add(Arrays.asList(dict.get(reversePrefix), i));
      }
    }
    return res;
  }

  private String reverse(String str) {
    int len = str.length();
    char[] chars = new char[len];
    for (int i = 0; i < len; i++)
      chars[i] = str.charAt(len - i - 1);
    return String.valueOf(chars);
  }

  private boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;
    while (left < right)
      if (str.charAt(left++) != str.charAt(right--))
        return false;
    return true;
  }

}
