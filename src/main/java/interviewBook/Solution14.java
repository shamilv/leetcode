package interviewBook;

import java.util.HashMap;
import java.util.Map;

public class Solution14 {
    public boolean isPermutation(String a) {
        a = a.toLowerCase();
        Map<Character, Integer> dict = new HashMap<>();
        for (Character ch: a.toCharArray()) {
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }

        int odd = 0;
        for (char ch: dict.keySet()) {
            int count = dict.get(ch);
            if (count % 2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }

}
