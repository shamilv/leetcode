package companies.amazon;

import java.util.HashMap;

public class Amazon3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> dict = new HashMap<>();
        int maxLen = 0;
        for (int r = 0, l = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (dict.containsKey(ch)) {
                int index = dict.get(ch);
                l = l <= index ? index + 1 : l;
            }
            dict.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
